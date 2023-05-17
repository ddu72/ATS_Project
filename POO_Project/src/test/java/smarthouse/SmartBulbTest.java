package smarthouse;//package Testes;
import smarthouse.*;
import static org.junit.jupiter.api.Assertions.*;
import static smarthouse.SmartDevice.Modo.OFF;
import java.util.Scanner;
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
        double custo = 0.5 + (1 * 2.5);
        assertEquals(custo,smartBulb.getConsumoDiario());
        assertNotNull(smartBulb1, "Erro ao criar a SmartBulb1");
        custo = 0.5+(120*2.5);
        assertEquals(custo,smartBulb1.getConsumoDiario());
        assertNotNull(smartBulb2, "Erro ao criar a SmartBulb2");
        assertEquals(custo,smartBulb2.getConsumoDiario());
        assertNotNull(smartBulb3, "Erro ao criar a SmartBulb3");
        assertEquals(50,smartBulb3.getConsumoDiario());
        assertNotNull(smartBulb4, "Erro ao criar a SmartBulb4");
        assertEquals(50,smartBulb4.getConsumoDiario());

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
        int quente = smartBulb.WARM;
        int neutro = smartBulb.NEUTRAL;
        int frio = smartBulb.COLD;
        assertEquals(neutro,smartBulb.getTone(), "Valor da tonalidade da smartBulb não é o esperado");

        smartBulb1.setTone(frio-1);
        assertEquals(frio,smartBulb1.getTone(), "Valor da tonalidade da smartBulb1 não é o esperado");

        smartBulb2.setTone(frio+1);
        assertEquals(neutro,smartBulb2.getTone(), "Valor da tonalidade da smartBulb2 não é o esperado");

        smartBulb3.setTone(quente+1);
        assertEquals(quente,smartBulb3.getTone(), "Valor da tonalidade da smartBulb3 não é o esperado");

        smartBulb4.setTone(quente-1);
        assertEquals(neutro,smartBulb4.getTone(), "Valor da tonalidade da smartBulb4 não é o esperado");


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

    @Test
    public void testClone(){
        SmartBulb cloned = smartBulb3.clone();
        assertNotSame(smartBulb3, cloned);

        assertEquals(smartBulb3.getModo(), cloned.getModo());
        assertEquals(smartBulb3.getCustoInstalacao(), cloned.getCustoInstalacao());
        assertEquals(smartBulb3.getID(), cloned.getID());
        assertEquals(smartBulb3.getTone(),cloned.getTone());
        assertEquals(smartBulb3.getTamanho(),cloned.getTamanho());
        assertEquals(smartBulb3.getConsumoDiario(),cloned.getConsumoDiario());
    }

    @Test
    public void testCriarSmartCamera(){
        String userInput = "OFF,WARM,6.3";
        Scanner scanner = new Scanner(userInput);


    }


}