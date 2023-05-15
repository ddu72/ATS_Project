package test.java;//package Testes;
import main.java.*;
import static org.junit.jupiter.api.Assertions.*;
import static main.java.SmartDevice.Modo.OFF;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import sun.util.locale.StringTokenIterator;


public class SmartBulbTest{

    SmartBulb smartBulb;
    SmartBulb smartBulb1;
    SmartBulb smartBulb2;
    SmartBulb smartBulb3;
    SmartBulb smartBulb4;

    @BeforeEach
    public void setUp() {
         smartBulb = new SmartBulb();
         smartBulb1 = new SmartBulb(OFF,120,25);
         smartBulb2 = new SmartBulb(120);
         smartBulb3 = new SmartBulb(OFF,120,25,50);
         smartBulb4 = new SmartBulb(smartBulb3);
    }


    @Test
    public void testeConstrutor(){
        assertNotNull(smartBulb, "Erro ao criar a SmartBulb");
        assertNotNull(smartBulb1, "Erro ao criar a SmartBulb1");
        assertNotNull(smartBulb2, "Erro ao criar a SmartBulb2");
        assertNotNull(smartBulb3, "Erro ao criar a SmartBulb3");
        assertNotNull(smartBulb4, "Erro ao criar a SmartBulb4");

   }
    /*
    public void testConsumoDiario() {
        SmartBulb SmartBulb1 = new SmartBulb();
        assertEquals(0,SmartBulb1.consumoDiario());
        SmartBulb SmartBulb2 = new SmartBulb(simulador,"SmartBulb1",5);
        assertEquals(0,SmartBulb2.consumoDiario());
        SmartBulb SmartBulb2 = new SmartBulb(simulador,"SmartBulb1",5,OFF,5,15,15);
        assertEquals(1.125, SmartBulb2.consumoDiario());
        SmartBulb SmartBulb3 = new SmartBulb(SmartBulb2);
        assertEquals(1.125, SmartBulb3.consumoDiario());
    }
    */

    @Test
    public void testSetTone(){
        smartBulb.setTone(3);
        assertEquals(2,smartBulb.getTone(), "Valor da tonalidade da smartBulb não é o esperado");

        smartBulb1.setTone(-1);
        assertEquals(0,smartBulb1.getTone(), "Valor da tonalidade da smartBulb1 não é o esperado");

        smartBulb2.setTone(0);
        assertEquals(0,smartBulb2.getTone(), "Valor da tonalidade da smartBulb2 não é o esperado");

        smartBulb3.setTone(1);
        assertEquals(1,smartBulb3.getTone(), "Valor da tonalidade da smartBulb3 não é o esperado");

        smartBulb4.setTone(2);
        assertEquals(2,smartBulb4.getTone(), "Valor da tonalidade da smartBulb4 não é o esperado");


    }

    @Test
    public void testSetTamanho(){
        smartBulb.setTamanho(15);
        assertEquals(15,smartBulb.getTamanho(), "Valor do tamanho não é o esperado");
    }

/*
    @Test
    public void testGetTone() {
        SmartBulb smartBulb1 = new SmartBulb();
        assertEquals(1,smartBulb1.getTone(), "Valor da tonalidade não é o esperado");
        smartBulb1 = new SmartBulb(2);
        assertEquals(2,smartBulb1.getTone(), "Valor da tonalidade não é o esperado");
        smartBulb1 = new SmartBulb(OFF,0,15);
        assertEquals(0,smartBulb1.getTone(), "Valor da tonalidade não é o esperado");
        SmartBulb smartBulb2 = new SmartBulb(smartBulb1);
        assertEquals(0,smartBulb2.getTone(), "Valor da tonalidade não é o esperado");
    }

    @Test
    public void testGetTamanho() {
        Simulador simulador = new Simulador();
 //       SmartBulb SmartBulb1 = new SmartBulb();
 //       assertEquals(1,SmartBulb1.getTone());
 //       SmartBulb SmartBulb1 = new SmartBulb(simulador,"SmartBulb1",2);
 //       assertEquals(2,SmartBulb1.getTone());
        SmartBulb smartBulb1 = new SmartBulb(simulador,"SmartBulb1",OFF,0,15);
        assertEquals(15,smartBulb1.getTamanho(),  "Valor do tamanho não é o esperado");
        SmartBulb smartBulb2 = new SmartBulb(smartBulb1);


        assertEquals(15,smartBulb2.getTone(),  "Valor do tamanho não é o esperado");
    }
 */


    /*
    Não sei se é suposto fazer testes para o criarSmartBulb.
    Se for, o que é que é o scanner?
    */

    @Test
    public void testToString(){
        String id = smartBulb3.getID();
        String modo = String.valueOf(smartBulb3.getModo());
        String tone =  String.valueOf(smartBulb3.getTone());
        String tamanho = String.format("%.2f",smartBulb3.getTamanho());
        String exp = "Lampada, id: "+id+", "+modo+", Tone: "+tone+", Tamanho: "+tamanho;
        String actual = smartBulb3.toString();
        assertTrue(exp.equals(actual), "String diferente da esperada");
    }

    //testar o clone nao faz sentido uma vez que nao é o mesmo objeto
    /*
    @Test
    public void testClone(){
        SmartBulb exp = (SmartBulb) smartBulb3.clone();

        assertTrue(exp==smartBulb3,"Objetos diferentes");
    }
    */


}