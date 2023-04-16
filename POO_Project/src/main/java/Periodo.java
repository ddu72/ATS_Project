package src;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Periodo implements Serializable {
    private LocalDate inicio;
    private LocalDate fim;

    public Periodo(LocalDate inicio, LocalDate fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public Periodo(Periodo periodo) {
        this.inicio = periodo.inicio;
        this.fim = periodo.fim;
    }

    public static Periodo escolherPeriodo(List<Periodo> listaPeriodo, Scanner scanner) {
        if (listaPeriodo.isEmpty()) {
            System.out.println("\n");
            System.out.println("+--------------------------------------------------+");
            System.out.println("| -> Ainda nao ha periodos de tempo                |");
            System.out.println("+--------------------------------------------------+\n");
            return null;
        }System.out.println("\n");
        System.out.println("+--------------------------------------------------+");
        System.out.println("| -> Escolhe um periodo                            |");
        System.out.println("+--------------------------------------------------+\n");

        for (int i=0; i<listaPeriodo.size(); i++) {
            System.out.println(i + " - " + listaPeriodo.get(i).toString());
        }
        int escolha = Integer.parseInt(scanner.nextLine()); //assume-se que escolheu uma opcao valida
        try {
            return listaPeriodo.get(escolha);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("+--------------------------------------------------+");
            System.out.println("| -> Escolha invalida                              |");
            System.out.println("+--------------------------------------------------+\n");

            return null;
        }

    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Periodo periodo = (Periodo) o;
        return this.inicio.equals(periodo.inicio) && this.fim.equals(periodo.fim);
    }

    public String toString() {
        return "Periodo de " + this.inicio + " a " + this.fim;
    }

    public Periodo clone() {
        return new Periodo(this);
    }
}
