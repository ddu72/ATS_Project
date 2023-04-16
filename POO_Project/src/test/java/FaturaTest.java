package ATS_Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.*;

import java.time.LocalDate;


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
        assertTrue(fatura.toString().equals("Periodo de 2023-1-1 a 2323-1-31")==true);
    }




}