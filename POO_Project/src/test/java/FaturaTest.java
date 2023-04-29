package src.test.java;
import src.main.java.*;

import org.junit.jupiter.api.*;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;


class FaturaTest {

    Fatura fatura;

    @BeforeEach
    public void setup(){
        LocalDate i = LocalDate.of(2023, 1, 1);
        LocalDate f = LocalDate.of(2023,1,31);
        fatura = new Fatura("Armando",i,f,100,100);
    }

    /*
    @Test
    void getPeriodoTest(){
        LocalDate i = LocalDate.of(2023, 1, 1);
        LocalDate f = LocalDate.of(2023,1,31);
        Periodo p = new Periodo(i,f);
        assertTrue(fatura.getPeriodo()==p, "periodo diferente");
    }
    */

    @Test
    void EqualsTest(){
        LocalDate i = LocalDate.of(2023, 1, 1);
        LocalDate f = LocalDate.of(2023,1,31);
        Periodo p = new Periodo(i,f);
        assertTrue(fatura.equals(p)==true, "periodo diferente");
    }

    @Test
    void toStringTest(){
        String nome = fatura.getNome();
        double consumo = fatura.getConsumo();
        double custo = fatura.getCusto();
        Periodo p = fatura.getPeriodo();
        assertSame("\nFatura para a casa de "+nome+"\nPeriodo de "+p.getInicio()+" a "+p.getFim()+"\nConusmo: "+consumo+"Kwh, Custo: "+custo+"\n", fatura.toString(),"Strings diferentes");
    }




}