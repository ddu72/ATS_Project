package src.test.java;//package Testes;

import static org.junit.jupiter.api.Assertions.*;
import static src.main.java.SmartDevice.Modo.OFF;
import static src.main.java.SmartSpeaker.criarSmartSpeaker;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;


public class SmartSpeakerTest {
    SmartSpeaker smartspeaker;
    SmartSpeaker smartspeaker1;
    SmartSpeaker smartspeaker2;
    SmartSpeaker smartspeaker3;

    @BeforeEach
    public void setUp() {
        smartspeaker = new SmartSpeaker();
        smartspeaker1 = new SmartSpeaker(OFF, 100, "Sony", "Megahits");
        smartspeaker2 = new SmartSpeaker(OFF, 100, "Sony", "Megahits", 100);
        smartspeaker3 = new SmartSpeaker(smartspeaker2);
    }

    @Test
    public void testeConstrutor() {
        assertNotNull(smartspeaker, "Erro ao criar a SmartSpeaker");
        assertNotNull(smartspeaker1, "Erro ao criar a SmartSpeaker1");
        assertNotNull(smartspeaker2, "Erro ao criar a SmartSpeaker2");
        assertNotNull(smartspeaker3, "Erro ao criar a SmartSpeaker3");
    }

    @Test
    public void testGetVolume() {
        smartspeaker3.setVolume(50);
        smartspeaker3.volumeUp();
        smartspeaker3.volumeDown();
        assertEquals(50, smartspeaker3.getVolume(), "Volume da smartspeaker3 diferente do esperado");
        smartspeaker.setVolume(200);
        assertEquals(100, smartspeaker.getVolume(), "Volume da smartspeaker diferente do esperado");
        smartspeaker1.setVolume(-10);
        assertEquals(0, smartspeaker1.getVolume(), "Volume da smartspeaker1 diferente do esperado");

        smartspeaker2.setVolume(99);
        for (int i = 0; i < 2; i++) smartspeaker2.volumeUp();
        assertEquals(100, smartspeaker2.getVolume(), "Volume da smartspeaker 2 (volume up) diferente do esperado");

        smartspeaker2.setVolume(1);
        for (int i = 0; i < 2; i++) smartspeaker2.volumeDown();
        assertEquals(0, smartspeaker2.getVolume(), "Volume da smartspeaker 2 (volume down) diferente do esperado");

    }

    @Test
    public void testGetMarca() {
        smartspeaker.setMarca("Lenovo");
        String exp = "Lenovo";
        assertTrue(exp.equals(smartspeaker.getMarca()) == true, "marca da smartspeaker diferente da esperada ");
    }

    @Test
    public void testGetRadio() {
        smartspeaker.setRadio("RUM");
        String exp = "RUM";
        assertTrue(exp.equals(smartspeaker.getRadio()) == true, "Rádio da smartspeaker diferente da esperada");
    }

    /*
    @Test
    public void testEquals(){
        assertTrue(smartspeaker2.equals(smartspeaker2)==true,"Teste de igualdade da coluna 2 falhado");
        assertTrue(smartspeaker2.equals(smartspeaker3)==true,"Teste de igualdade da coluna 3 falhado");
        assertTrue(smartspeaker2.equals(smartspeaker1)==false,"Teste de igualdade da coluna 1 falhado");
    }
    */
    @Test
    public void testToString(){
        String id = smartspeaker2.getID();
        String mod = String.valueOf(smartspeaker2.getModo());
        String vol = String.valueOf(smartspeaker2.getVolume());
        String exp="Coluna, id: "+id+", "+mod+", "+vol;
        String actual = smartspeaker2.toString();
        assertTrue(exp.equals(actual)==true,"String diferentes");
    }

    @Test
    public void testConsumoDiario(){
        smartspeaker2.calcularConsumoDiario();
        assertEquals(5.5,smartspeaker2.getConsumoDiario(),"Consumo diário da smartspeaker2 diferente do esperado");
    }






















}
    /*
    @Test
    public void testSetVolume() {
        Simulador simulador = new Simulador();
        SmartSpeaker smartSpeaker1 = new SmartSpeaker(OFF,13,"Panasonic","RUM");
        simulador.addDispositivo(smartSpeaker1);
        smartSpeaker1.volumeUp();
        smartSpeaker1.volumeUp();
        assertEquals(15, smartSpeaker1.getVolume(), "Não é o volume esperado");
        for (int i=0; i<25; i++) smartSpeaker1.volumeUp();
        assertEquals(40, smartSpeaker1.getVolume(), "Não é o volume esperado");
        for (int i=0; i<70; i++) smartSpeaker1.volumeUp();
        assertEquals(100, smartSpeaker1.getVolume(), "Não é o volume esperado");
        for (int i=0; i<70; i++) smartSpeaker1.volumeDown();
        assertEquals(30, smartSpeaker1.getVolume(), "Não é o volume esperado");
        for (int i=0; i<50; i++) smartSpeaker1.volumeDown();
        assertEquals(0, smartSpeaker1.getVolume(), "Não é o volume esperado");
        smartSpeaker1.setVolume(50);
        assertEquals(50,smartSpeaker1.getVolume(), "Não é o volume esperado");
        smartSpeaker1.setVolume(150);
        assertEquals(100,smartSpeaker1.getVolume(), "Não é o volume esperado");
        smartSpeaker1.setVolume(-50);
        assertEquals(0,smartSpeaker1.getVolume(), "Não é o volume esperado");
    }

    @Test
    public static void criarSmartSpeakerTest(){
        InputStream sysInBackup = System.in;
        Simulador simulador = new Simulador();
        Scanner scanner = new Scanner(System.in);
        SmartSpeaker ss = criarSmartSpeaker(scanner);
        String input = "ON,73,JBL,MEGAHITS";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        System.setIn(sysInBackup);
        assertEquals(SmartDevice.Modo.ON, simulador.getDispositivos().get(1).getModo(),"erro");
        //assertEquals(73, simulador.getDispositivos().get(1).getVolume(),"erro");
        //assertEquals("JBL",simulador.getDispositivos().get(1).getMarca(),"erro");
        //assertEquals("MEGAHITS",simulador.getDispositivos().get(1).getRadio(),"erro");
    }

    }
*/

    /*
    Não sei se é suposto fazer testes para o criarSmartSpeaker.
    Se for, o que é que é o scanner?
    */