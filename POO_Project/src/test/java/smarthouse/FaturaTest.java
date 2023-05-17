package smarthouse;
import smarthouse.*;

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

    @Test
    public void testConstrutor(){
        assertNotNull(fatura);
        assertEquals("Armando",fatura.getNome(),"nomes da fatura não são iguais");
        Fatura f = new Fatura(fatura);
        assertNotNull(f);
        assertEquals("Armando",f.getNome());
        assertEquals(100,f.getConsumo());
        assertEquals(100,f.getCusto());
        Periodo p = new Periodo(LocalDate.of(2023, 1, 1),LocalDate.of(2023,1,31));
        assertEquals(p,f.getPeriodo());
    }

    @Test
    void testClone(){
        Fatura cloned = fatura.clone();

        assertNotSame(fatura, cloned);
        assertEquals(fatura.getNome(),cloned.getNome());
        assertEquals(fatura.getConsumo(),cloned.getConsumo());
        assertEquals(fatura.getCusto(),cloned.getCusto());
        assertEquals(fatura.getPeriodo(),cloned.getPeriodo());
    }
/*
    @Test
    void toStringTest(){
        String nome = fatura.getNome();
        double consumo = fatura.getConsumo();
        double custo = fatura.getCusto();
        Periodo p = fatura.getPeriodo();
        String exp = "\nFatura para a casa de "+nome+"\nPeriodo de "+p.getInicio()+" a "+p.getFim()+"\nConusmo: "+consumo+"Kwh, Custo: "+custo+"\n";
        String actual = fatura.toString();
        assertTrue(exp.equals(actual),"Strings diferentes");
    }
*/



}