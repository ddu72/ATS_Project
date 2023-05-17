package smarthouse;
import smarthouse.*;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Month;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PeriodoTest {

    @Test
    void testeConstrutor(){
        LocalDate inicio = LocalDate.of(2022, Month.JANUARY,1);
        LocalDate fim = LocalDate.of(2022,Month.JANUARY,31);
        Periodo p = new Periodo(inicio,fim);
        assertNotNull(p, "Erro ao criar o periodo");
        assertEquals(inicio,p.getInicio());
        assertEquals(fim,p.getFim());
    }

    @Test
    void testeEquals(){
        LocalDate inicio = LocalDate.of(2022, Month.JANUARY,1);
        LocalDate fim = LocalDate.of(2022,Month.JANUARY,31);
        Periodo p1 = new Periodo(inicio,fim);
        Periodo p2 = new Periodo(inicio,fim);
        Periodo p3 = new Periodo(inicio,inicio);
        assertTrue(p1.equals(p2),"Os objetos não são iguais");
        assertTrue(p2.equals(p2));
        assertTrue(p2.equals(p1));
        assertFalse(p1.equals(null));
        assertFalse(p1.equals(p3));
        assertFalse(p3.equals(p1));
    }

    @Test
    public void testEscolhePeriodo(){
        List<Periodo> l = new ArrayList<Periodo>();
        /*
        LocalDate inicio = LocalDate.of(2022, Month.JANUARY,1);
        LocalDate fim = LocalDate.of(2022,Month.JANUARY,31);
        Periodo p = new Periodo(inicio,fim);
         */
        String userInput = "1";
        Scanner scanner = new Scanner(userInput);
        assertNull(Periodo.escolherPeriodo(l,scanner));


        Periodo p1 = new Periodo(LocalDate.of(2023, Month.JANUARY,1),LocalDate.of(2023, Month.JANUARY,1));
        Periodo p2 = new Periodo(LocalDate.of(2024, Month.JANUARY,1),LocalDate.of(2024, Month.JANUARY,1));
        Periodo p3 = new Periodo(LocalDate.of(2025, Month.JANUARY,1),LocalDate.of(2025, Month.JANUARY,1));

        l.add(p1);l.add(p2);l.add(p3);

        assertEquals(p2,Periodo.escolherPeriodo(l,scanner));

        userInput = "5";
        scanner = new Scanner(userInput);
        assertNull(Periodo.escolherPeriodo(l,scanner));

/*
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        for (int i = 0; i < l.size(); i++) {
            System.out.println(i + " - " + l.get(i).toString());
        }

        System.out.flush();
        System.setOut(originalOut);

        String expectedOutput = "0 - Period 1\n1 - Period 2\n2 - Period 3\n";
        String actualOutput = outputStream.toString();
        assertEquals(expectedOutput, actualOutput);
*/

    }

    @Test
    void testClone(){
        Periodo p1 = new Periodo(LocalDate.of(2023, Month.JANUARY,1),LocalDate.of(2023, Month.JANUARY,1));
        Periodo cloned = p1.clone();

        assertNotNull(cloned);

        assertEquals(p1.getInicio(),cloned.getInicio());
        assertEquals(p1.getFim(), cloned.getFim());
    }

    @Test
    void testeToString(){
        LocalDate inicio = LocalDate.of(2022, Month.JANUARY,1);
        LocalDate fim = LocalDate.of(2022,Month.JANUARY,31);
        Periodo p1 = new Periodo(inicio,fim);
        String s = "Periodo de " + inicio + " a " + fim;
        assertTrue(s.equals(p1.toString()),"Strings não são iguais");
    }


}