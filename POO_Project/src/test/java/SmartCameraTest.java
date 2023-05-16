package test.java;

import static main.java.SmartDevice.Modo.OFF;
import static main.java.SmartDevice.Modo.ON;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import main.java.SmartCamera;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.java.*;


public class SmartCameraTest{

    SmartCamera smartcamera;
    SmartCamera smartcamera1;
    SmartCamera smartcamera2;
    SmartCamera smartcamera3;

    @BeforeEach
    public void setUp(){

        smartcamera = new SmartCamera();
        smartcamera1 = new SmartCamera(OFF, 10,10, 100);
        smartcamera2 = new SmartCamera(OFF, 10, 10, 100,100);
        smartcamera3 = new SmartCamera(smartcamera2);
    }

    @Test
	public void testeConstrutor(){
		assertNotNull(smartcamera, "Erro ao criar a SmartCamera");
        double fator = 100 / 5000000.0; // /1000 para tornar o numero mais pequeno
        double consumo = 0.5 + fator * (100 / 100.0);
        assertEquals(consumo,smartcamera.getConsumoDiario(), 0.001);
        assertNotNull(smartcamera1, "Erro ao criar a SmartCamera1");
        assertEquals(consumo,smartcamera1.getConsumoDiario());
        assertNotNull(smartcamera2, "Erro ao criar a SmartCamera2");
        assertEquals(OFF, smartcamera2.getModo());
        assertEquals(10, smartcamera2.getWidth());
        assertEquals(10, smartcamera2.getHeight());
        assertEquals(100, smartcamera2.getTamanhoFicheiro(), 0.001);
        assertEquals(100, smartcamera2.getConsumoDiario(), 0.001);
        assertNotNull(smartcamera3, "Erro ao criar a SmartCamera3");
    }


    @Test
    public void testCalcularConsumoDiario() {
        // Set the file size and image resolution for testing
        double tamanhoFicheiro = 500; // File size in KB
        int width = 800;
        int height = 600;

        // Calculate the expected consumption based on the formula in the method
        double expectedConsumo = 0.5 + (width * height / 5000000.0) * (tamanhoFicheiro / 100.0);

        // Call the calcularConsumoDiario method
        smartcamera2.setTamanhoFicheiro(tamanhoFicheiro);
        smartcamera2.setWidth(width);
        smartcamera2.setHeight(height);
        smartcamera2.calcularConsumoDiario();

        // Verify that the calculated consumption matches the expected value
        assertEquals(expectedConsumo, smartcamera2.getConsumoDiario(), 0.001); // Using delta for double comparison
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

    @Test
    public void testClone() {
        SmartCamera original = new SmartCamera(ON, 10, 10, 100, 100.0);
        SmartCamera cloned = original.clone();

        // Verify that the cloned object is not the same reference as the original
        assertNotSame(original, cloned);

        // Verify that the properties of the cloned object are the same as the original
        assertEquals(original.getModo(), cloned.getModo());
        assertEquals(original.getCustoInstalacao(), cloned.getCustoInstalacao());
        assertEquals(original.getID(), cloned.getID());
        assertEquals(original.getHeight(), cloned.getHeight());
        assertEquals(original.getWidth(), cloned.getWidth());
        assertEquals(original.getTamanhoFicheiro(), cloned.getTamanhoFicheiro());
    }

    @Test
    public void testCriarSmartCamera() {
        // Simulate user input
        String userInput = "ON,1920,1080,50";
        Scanner scanner = new Scanner(userInput);

        // Call the method and capture the returned SmartSpeaker object
        SmartCamera smartCameraInput = SmartCamera.criarSmartCamera(scanner);

        // Verify the properties of the created SmartSpeaker object
        assertEquals(ON, smartCameraInput.getModo());
        assertEquals(1920, smartCameraInput.getWidth());
        assertEquals(1080, smartCameraInput.getHeight());
        assertEquals(50, smartCameraInput.getTamanhoFicheiro());
    }




}