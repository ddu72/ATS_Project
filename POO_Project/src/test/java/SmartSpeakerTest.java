package test.java;//package Testes;

import static org.junit.jupiter.api.Assertions.*;
import static main.java.SmartDevice.Modo.OFF;
import static main.java.SmartDevice.Modo.ON;
import static main.java.SmartSpeaker.criarSmartSpeaker;
import java.util.Scanner;

import main.java.SmartSpeaker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.java.*;

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
        assertEquals(100,smartspeaker2.getConsumoDiario(),"Consumo diario da smartspeaker 2 difernte do esperado");
        assertNotNull(smartspeaker3, "Erro ao criar a SmartSpeaker3");
        SmartSpeaker s = new SmartSpeaker(OFF,-1,"Hisense","Mega",10);
        assertEquals(0,s.getVolume(),"volume diferente do espeado");
        int mx = SmartSpeaker.MAX;
        SmartSpeaker sp = new SmartSpeaker(OFF,-1,"Hisense","Mega",10);
        assertEquals(0,sp.getVolume(),"volume diferente do espeado");
        SmartSpeaker s1 = new SmartSpeaker(OFF,mx+10,"Hisense","Mega",10);
        assertEquals(mx,s1.getVolume(),"Volume passa do maximo");

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

        int maxVolume = SmartSpeaker.MAX;
        SmartSpeaker speaker = new SmartSpeaker(OFF, maxVolume + 1, "JBL", "Megahits", 10.0);
        assertEquals(maxVolume, speaker.getVolume());

        int negativeVolume = -1;
        SmartSpeaker speaker1 = new SmartSpeaker(OFF, negativeVolume, "JBL", "Megahits", 10.0);
        assertEquals(0, speaker1.getVolume());
    }

    @Test
    public void testSetVolume(){
        int maxVolume = SmartSpeaker.MAX;
        int minVolume = 0;

        smartspeaker.setVolume(maxVolume);
        assertEquals(maxVolume,smartspeaker.getVolume(),"volume diferente");

        smartspeaker.setVolume(-100);
        assertEquals(minVolume,smartspeaker.getVolume(),"nao respeita o volume min");
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


    @Test
    public void testEquals(){
        assertTrue(smartspeaker2.equals(smartspeaker2),"Teste de igualdade da coluna 2 falhado");
        assertTrue(smartspeaker2.equals(smartspeaker3),"Teste de igualdade da coluna 3 falhado");
        assertTrue(smartspeaker3.equals(smartspeaker2));
        assertFalse(smartspeaker3.equals(null),"teste do equals null falhado");
        //assertTrue(smartspeaker2.equals(smartspeaker1)==false,"Teste de igualdade da coluna 1 falhado");
        SmartSpeaker speaker1 = new SmartSpeaker(ON, 50, "JBL", "Megahits", 10.0);
        SmartSpeaker speaker2 = new SmartSpeaker(ON, 50, "JBL", "Megahits", 10.0);
        SmartSpeaker speaker3 = new SmartSpeaker(OFF, 100, "Sony", "Rock FM", 5.0);

        // Test equality between speaker1 and speaker2
        assertTrue(speaker1.equals(speaker2));
        assertTrue(speaker2.equals(speaker1));

        // Test inequality between speaker1 and speaker3
        assertFalse(speaker1.equals(speaker3));
        assertFalse(speaker3.equals(speaker1));
    }

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

    @Test
    public void testClone() {
        SmartSpeaker original = new SmartSpeaker(ON, 50, "JBL", "Megahits", 10.0);
        SmartSpeaker cloned = original.clone();

        // Verify that the cloned object is not the same reference as the original
        assertNotSame(original, cloned);

        // Verify that the properties of the cloned object are the same as the original
        assertEquals(original.getModo(), cloned.getModo());
        assertEquals(original.getCustoInstalacao(), cloned.getCustoInstalacao());
        assertEquals(original.getID(), cloned.getID());
        assertEquals(original.getVolume(), cloned.getVolume());
        assertEquals(original.getMarca(), cloned.getMarca());
        assertEquals(original.getRadio(), cloned.getRadio());
    }

    @Test
    public void testCriarSmartSpeaker() {
        // Simulate user input
        String userInput = "ON,50,JBL,Megahits";
        Scanner scanner = new Scanner(userInput);

        // Call the method and capture the returned SmartSpeaker object
        SmartSpeaker smartSpeakerInput = SmartSpeaker.criarSmartSpeaker(scanner);

        // Verify the properties of the created SmartSpeaker object
        assertEquals(ON, smartSpeakerInput.getModo());
        assertEquals(50, smartSpeakerInput.getVolume());
        assertEquals("JBL", smartSpeakerInput.getMarca());
        assertEquals("Megahits", smartSpeakerInput.getRadio());
    }
}
