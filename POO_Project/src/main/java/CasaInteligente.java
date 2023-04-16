package src;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


/**
 * A CasaInteligente faz a gestao dos SmartDevices que existem e dos
 * espacos (as salas) que existem na casa.
*/

// mudar o metodo de procura pelos maps usei forEach que era o que sabia usar melhor mas existem metodos mais eficientes
// exceto para a funcao turnAllOn acho que o forEach e bom nessa
public class CasaInteligente implements Serializable, PendingChanges{
    private Comercializador comercializador;
    private Comercializador comercializadorToChange;
    private String nome;
    private int nif;
    private Map<String, SmartDevice> devices;
    private Map<String, List<String>> locations;
    private List<Fatura> faturas;

    public CasaInteligente() {
        // initialise instance variables
        this.nome = "N/A";
        this.nif = -1;
        this.devices = new HashMap();
        this.locations = new HashMap();
        this.comercializador = null;
        this.comercializadorToChange = null;
        this.faturas = new ArrayList<>();
    }

    public CasaInteligente(String nome, int nif, Comercializador comercializador) {
        // initialise instance variables
        this.nome = nome;
        this.nif = nif;
        this.devices = new HashMap<>();
        this.locations = new HashMap<>();
        this.comercializador = comercializador;
        this.comercializadorToChange = null;
        this.faturas = new ArrayList<>();
    }

    public CasaInteligente(CasaInteligente casaInteligente) {
        this.nome = casaInteligente.nome;
        this.nif = casaInteligente.nif;
        this.devices = casaInteligente.devices.entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().clone()));
        this.locations = casaInteligente.locations.entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey(), e -> new ArrayList<>(e.getValue())));
        this.comercializador = casaInteligente.comercializador.clone();
        if (casaInteligente.comercializadorToChange != null) {
            this.comercializadorToChange = casaInteligente.comercializadorToChange.clone();
        } else {
            this.comercializadorToChange = null;
        }
        this.faturas = casaInteligente.faturas.stream().map(Fatura::clone).collect(Collectors.toList());
    }

    public void setDeviceOn(String devCode) {
        this.devices.get(devCode).turnOn();
    }

    public boolean existsDevice(String id) {
        return this.devices.keySet().contains(id);
    }

    public void addDevice(SmartDevice s) {
        this.devices.put(s.getID(), s);
    }


    /*
    Recebe uma lista de divisoes em String e mostra ao utilizador para escolher uma
     */
    public String escolherDivisao(Scanner scanner) {
        Set<String> divisoes = this.locations.keySet();
        System.out.println("\n+--------------------------------------------------+");
        System.out.println("| -> Divisoes disponiveis                          |");
        for (String div: divisoes) {
            System.out.println(div);
        }
        System.out.println("+--------------------------------------------------+");
        System.out.println("| -> Escreva o nome da divisao que quer            |");
        System.out.println("+--------------------------------------------------+\n");
        System.out.println("Insere aqui a tua resposta: ");
        String escolha = scanner.nextLine(); //assume-se que escolheu uma opcao valida
        if (divisoes.contains(escolha)) {
            return escolha;
        } else {
            System.out.println("+--------------------------------------------------+");
            System.out.println("| -> Essa Divisao nao existe                       |");
            System.out.println("+--------------------------------------------------+\n");
            return "";
        }
    }

    /*
    Recebe uma string que representa a divisao, e um boleano que indica se e pra ligar ou desligar os
    dispositivos dessa divisao
     */
    public void setAllOn(String divisao, boolean b) {
        if (!locations.containsKey(divisao)) return; //nao contem esta divisao
        List<String> deviceList = locations.get(divisao);
        for (String str: deviceList) {
            SmartDevice dev = devices.get(str);
            if (dev != null) {
                dev.setOn(b);
            }
        }
    }

    public void listarDispositivos() {
        for (SmartDevice sd: this.devices.values()) {
            System.out.println(sd);
        }
    }

    /*
    Devolve uma string com o conteudo inteiro da casa, ou seja,
    contendo as divisoes e para cada divisao os dispositivos delas
     */
    public String conteudo() {
        StringBuilder sB = new StringBuilder();
        for (String divisao: this.locations.keySet()) {
            List<String> dispIds = this.locations.get(divisao);
            sB.append("Divisao: ");
            sB.append(divisao);
            sB.append("\n");
            if (!dispIds.isEmpty()) {
                for (String id: dispIds) {
                    SmartDevice sd = this.devices.get(id);
                    if (sd != null) {
                        //dispositivo existe
                        sB.append(sd.toString());
                        sB.append("\n");
                    }
                }
            }
        }
        return sB.toString();
    }

    public boolean existsRooms() {
        return !this.locations.isEmpty();
    }

    public void addRoom(String s) {
        this.locations.put(s, new ArrayList<>());
    }

    public boolean hasRoom(String s) {
        return this.locations.keySet().contains(s);
    }

    public void addToRoom (String s1, String s2) {
        if (this.locations.get(s1) == null) {
            addRoom(s1);
        }
        this.locations.get(s1).add(s2);
    }

    public boolean roomHasDevice (String s1, String s2) {
        List<String> devices = this.locations.get(s1);
        if (devices != null && !devices.isEmpty()) {
            return devices.contains(s2);
        }
        return false;
    }

    public double precoPorDia() {
        double ret = 0;
        for (SmartDevice smartDevice: devices.values()) {
            ret += comercializador.precoDiaPorDispositivo(smartDevice);
        }
        return ret;
    }

    public void saltarParaData(LocalDate inicio, LocalDate dataFinal) {
        if (this.devices.isEmpty()) {
            //A casa nao tem dispositivos, para esta funcao
            System.out.println("\n");
            System.out.println("+--------------------------------------------------+");
            System.out.println(" -> A casa " + this.toString() + " nao tem dispositivos");
            System.out.println("+--------------------------------------------------+\n");
            return;
        }

        double consumo = 0;
        double custo = 0;

        for (SmartDevice smartDevice: this.devices.values()) {
            consumo += smartDevice.consumoAte(inicio, dataFinal);
            custo += smartDevice.custoAte(this.comercializador, inicio,  dataFinal);
        }
        faturar(inicio,dataFinal,consumo,custo);
    }

    public void faturar(LocalDate inicio, LocalDate fim, double consumo, double custo) {
        Fatura fatura = new Fatura(this.nome,inicio,fim,consumo,custo);
        this.faturas.add(fatura);
        this.comercializador.addFatura(fatura);
    }

    public static CasaInteligente escolherCasa(Map<Integer, CasaInteligente> casas, Scanner scanner) {
        if (casas.isEmpty()) {
            System.out.println("\n");
            System.out.println("+--------------------------------------------------+");
            System.out.println("| -> Nao existem casas                             |");
            System.out.println("+--------------------------------------------------+\n");
            return null;
        }
        for (CasaInteligente casa: casas.values()) {
            System.out.println(casa.toString());
        }
        System.out.println("\n");
        System.out.println("+--------------------------------------------------+");
        System.out.println("| -> Escreve o nif da casa que queres              |");
        System.out.println("+--------------------------------------------------+\n");
        System.out.println("Insere aqui a tua resposta: ");
        int nif = Integer.parseInt(scanner.nextLine()); //assume-se que escolheu uma opcao valida
        if (casas.containsKey(nif)) {
            return casas.get(nif);
        } else {
            System.out.println("\n");
            System.out.println("+--------------------------------------------------+");
            System.out.println("| -> Nao ha nenhuma casa com este nif              |");
            System.out.println("+--------------------------------------------------+\n");
            return null;
        }
    }

    public static CasaInteligente parse(Simulador simulador, String linha) {
        String[] linhaPartida = linha.split(",", 3); //no maximo 3 parametros
        String nome = linhaPartida[0];
        int nif = Integer.valueOf(linhaPartida[1]);
        String nomeComercializador = linhaPartida[2];
        Comercializador c = simulador.getComercializador(nomeComercializador);

        CasaInteligente casa = new CasaInteligente(nome, nif, c);
        return casa;
    }

    public void addAllDevices(Map<String, SmartDevice> disps) {
        for (Map.Entry<String, SmartDevice> sd: this.devices.entrySet()) {
            disps.put(sd.getKey(), sd.getValue());
        }
    }

    public Fatura getFatura(Periodo periodo) {
        for (Fatura fatura: this.faturas) {
            if (fatura.getPeriodo().equals(periodo)) {
                return fatura;
            }
        }
        System.out.println("\n");
        System.out.println("+--------------------------------------------------+");
        System.out.println("| -> Nao encontrou fatura neste periodo            |");
        System.out.println("+--------------------------------------------------+\n");
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public Map<String, SmartDevice> getDevices() {
        return devices;
    }

    public void setDevices(Map<String, SmartDevice> devices) {
        this.devices = devices;
    }

    public Map<String, List<String>> getLocations() {
        return locations;
    }

    public void setLocations(Map<String, List<String>> locations) {
        this.locations = locations;
    }

    public Comercializador getComercializador() {
        //comercializador antes das mudancas pendentes
        return comercializador;
    }

    public void setComercializador(Comercializador comercializador) {
        //coloca o novo comercializador nas mudancas pendentes
        this.comercializadorToChange = comercializador;
    }

    public List<Fatura> getFaturas() {
        return faturas;
    }

    public void setFaturas(List<Fatura> faturas) {
        this.faturas = new ArrayList<>(faturas);
    }

    public CasaInteligente clone() {
        return new CasaInteligente(this);
    }

    @Override
    public void change() {
        if (this.comercializadorToChange != null) {
            this.comercializador = this.comercializadorToChange;
            this.comercializadorToChange = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Casa de ");
        sb.append(this.nome);
        sb.append(" (nif: ");
        sb.append(this.nif);
        sb.append(", Fornecedor: ");
        sb.append(this.comercializador.toString());
        sb.append(")");
        return sb.toString();
    }

    public boolean equals(Object o) {
        if (this==o) return true;
        if (o==null || this.getClass() != o.getClass()) return false;
        CasaInteligente casaInteligente = (CasaInteligente) o;
        return this.nome.equals(casaInteligente.nome) && this.nif == casaInteligente.nif;
    }
}
