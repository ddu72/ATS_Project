package src;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public abstract class SmartDevice implements Serializable, PendingChanges{
    private String id;
    private double custoInstalacao;
    private double consumoDiario;
    private Modo modo;
    private Modo modoToChange;

    public enum Modo{
        ON, OFF;
    }

    public SmartDevice() {
        this.id = "N/A";
        this.modo = Modo.OFF;
        this.modoToChange = null;
        this.custoInstalacao = 0;
        this.consumoDiario = -1;

    }

    public SmartDevice(double custoInstalacao) {
        this.id = ""; //ainda nao foi definido o id
        this.custoInstalacao = custoInstalacao;
        this.consumoDiario = -1;
        this.modo = Modo.OFF;
        this.modoToChange = null;
    }

    public SmartDevice(double custoInstalacao, Modo modo) {
        this.id = "";
        this.custoInstalacao = custoInstalacao;
        this.consumoDiario = -1;
        this.modo = modo;
        this.modoToChange = null;
    }

    public SmartDevice(SmartDevice smartDevice) {
        this.id = smartDevice.getID();
        this.custoInstalacao = smartDevice.custoInstalacao;
        this.consumoDiario = smartDevice.consumoDiario;
        this.modo = smartDevice.modo;
        this.modoToChange = smartDevice.modoToChange;
    }

    public double consumoAte(LocalDate inicio, LocalDate fim) {
        if (modo == Modo.ON) {
            int diasPassados = inicio.until(fim).getDays();
            return diasPassados * this.consumoDiario;
        } else return 0;
    }

    public double custoAte(Comercializador comercializador, LocalDate inicio, LocalDate fim) {
        if (this.modo == Modo.ON) {
            int diasPassados = inicio.until(fim).getDays();
            return comercializador.precoDiaPorDispositivo(this) * diasPassados;
        } else return 0;
    }

    public void turnOn() {
        this.modoToChange = Modo.ON; //coloca a mudanca de maneira a ser executada no fim do periodo de simulacao
    }

    public void turnOff() {
        this.modoToChange = Modo.OFF; //coloca a mudanca de maneira a ser executada no fim do periodo de simulacao
    }

    public void setOn(boolean b) {
        if (b) turnOn();
        else turnOff();
    }

    public String getID() {
        return id;
    }

    public void setID(String ID) {
        this.id = ID;
    }

    public double getCustoInstalacao() {
        return custoInstalacao;
    }

    public abstract void calcularConsumoDiario();

    public void setCustoInstalacao(double custoInstalacao) {
        this.custoInstalacao = custoInstalacao;
    }

    public Modo getModo() {
        return modo;
    }

    public boolean isOn() {
        return this.modo == Modo.ON;
    }

    public void setConsumoDiario(double consumo) {
        this.consumoDiario = consumo;
    }

    public double getConsumoDiario() {
        return this.consumoDiario;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().toString());
        sb.append(", ");
        sb.append(this.id);
        sb.append(", ");
        sb.append(this.modo);
        return sb.toString();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        SmartDevice smartDevice = (SmartDevice) o;
        return this.id == smartDevice.getID() &&
                this.custoInstalacao == smartDevice.getCustoInstalacao() &&
                this.modo.equals(smartDevice.getModo());
    }

    public static SmartDevice escolherDispositivo(Map<String, SmartDevice> disp, Scanner scanner) {
        for (SmartDevice sD: disp.values()) {
            System.out.println(sD);
        }
        System.out.println("\n");
        System.out.println("+--------------------------------------------------+");
        System.out.println("| -> Escolhe o id do dispositivo que queres        |");
        System.out.println("+--------------------------------------------------+\n");
        System.out.println("Insere aqui a tua resposta:");
        String id = scanner.nextLine(); //assume-se que escolheu uma opcao valida
        if (disp.containsKey(id)) {
            return disp.get(id);
        } else {
            System.out.println("\n");
            System.out.println("+--------------------------------------------------+");
            System.out.println("| -> Id nao existente                              |");
            System.out.println("+--------------------------------------------------+\n");

            return null;
        }
    }

    public abstract SmartDevice clone();

    @Override
    public void change() {
        if (this.modoToChange != null) {
            this.modo = this.modoToChange;
            this.modoToChange = null;
        }
    }
}
