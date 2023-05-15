package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static main.java.SmartDevice.Modo.OFF;
import main.java.*;


public class SmartCameraTest{

    SmartCamera smartcamera;
    SmartCamera smartcamera1;
    SmartCamera smartcamera2;
    SmartCamera smartcamera3;

    @BeforeEach
    public void setUp(){
        smartcamera = new SmartCamera();
        smartcamera1 = new SmartCamera(OFF, 100,100, 100);
        smartcamera2 = new SmartCamera(OFF, 10, 10, 100,100);
        smartcamera3 = new SmartCamera(smartcamera2);
    }

    @Test
	public void testeConstrutor(){
		assertNotNull(smartcamera, "Erro ao criar a SmartCamera");
        assertNotNull(smartcamera1, "Erro ao criar a SmartCamera1");
        assertNotNull(smartcamera2, "Erro ao criar a SmartCamera2");
        assertNotNull(smartcamera3, "Erro ao criar a SmartCamera3");
    }

    @Test
	public void testConsumoDiario() {
        smartcamera1.calcularConsumoDiario();
        assertEquals(0.502,smartcamera1.getConsumoDiario(),"Consumo diário na camera  diferente do esperado");
        smartcamera2.calcularConsumoDiario();
        assertEquals(0.50002,smartcamera2.getConsumoDiario(),"Consumo diário na camera 2 diferente do esperado");
    }

    @Test
    public void testGetWidth() {
        smartcamera1.setWidth(10);
        assertEquals(10,smartcamera1.getWidth(),"width da camera 1 diferente do esperado");
    }

    @Test
    public void testGetHeight() {
       smartcamera1.setHeight(10);
       assertEquals(10, smartcamera1.getHeight(),"Height da smartCamera 1 diferente do esperado");
    }

    @Test
    public void testGetTamanhoFicheiro() {
        smartcamera1.setTamanhoFicheiro(10);
        assertEquals(10,smartcamera1.getTamanhoFicheiro(),"tamanho do ficheiro diferente do esperado");
    }

    @Test
    public void testToString(){
        String id = smartcamera2.getID();
        String modo = String.valueOf(smartcamera2.getModo());
        String width =  String.valueOf(smartcamera2.getWidth());
        String height = String.valueOf(smartcamera2.getHeight());
        String exp = "Camera, id: "+id+", "+modo+", ("+width+"x"+height+")";
        String actual = smartcamera2.toString();
        assertTrue(exp.equals(actual), "String diferente da esperada");
    }


/*
    @Test
    public void testSetWidth(){
        SmartCamera smartCamera1 = new SmartCamera();
        smartCamera1.setWidth(15);
        assertEquals(15,smartCamera1.getWidth(), "Valor do width não é o esperado");
    }

    @Test
    public void testSetHeight(){
        SmartCamera smartCamera1= new SmartCamera();
        smartCamera1.setHeight(15);
        assertEquals(15,smartCamera1.getHeight(), "Valor do height não é o esperado");
    }

    @Test
    public void testSetTamanhoFicheiro(){
        SmartCamera smartCamera1 = new SmartCamera();
        smartCamera1.setTamanhoFicheiro(15);
        assertEquals(15,smartCamera1.getTamanhoFicheiro(), "Valor do tamanho do ficheiro não é o esperado");
    }

 */

    /*
    Não sei se é suposto fazer testes para o criarSmartCamera.
    Se for, o que é que é o scanner?
    */
}