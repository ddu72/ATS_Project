package smarthouse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import smarthouse.*;

import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;
import static smarthouse.SmartDevice.Modo.OFF;
import static smarthouse.SmartDevice.Modo.ON;


class CasaInteligenteTest {

    CasaInteligente casaInteligente;
    Comercializador comercializador;
    SmartSpeaker coluna;
    SmartCamera camera;
    SmartBulb lamp;

    @BeforeEach
    public void setup() {
        comercializador = new Comercializador();
        casaInteligente = new CasaInteligente();
        coluna = new SmartSpeaker(OFF,100,"JBL","Megahits");
        camera = new SmartCamera(OFF,10,10,100,100);
        lamp = new SmartBulb(OFF,1,10,100);
        casaInteligente.setNome("CasaTeste");
        casaInteligente.setNif(100);
        casaInteligente.addDevice(coluna);
        casaInteligente.addDevice(camera);
        casaInteligente.addDevice(lamp);
        casaInteligente.addRoom("sala");
        casaInteligente.addRoom("quarto");
    }

    @Test
    public void construtorTest(){
        assertNotNull(casaInteligente,"Erro ao criar a casa inteligente 1");
        casaInteligente = new CasaInteligente("casa 2",2,comercializador);
        assertNotNull(casaInteligente,"Erro ao criar a casa inteligente 2");
        CasaInteligente casainteligente1 = new CasaInteligente(casaInteligente);
        assertNotNull(casainteligente1,"Erro ao criar a casa inteligente 3");

        Map<String, SmartDevice> originalDevices = casaInteligente.getDevices();
        Map<String, SmartDevice> copyDevices = casainteligente1.getDevices();
        assertEquals(originalDevices.size(), copyDevices.size(),"smartdevices inesperado");
        for (Map.Entry<String, SmartDevice> entry : originalDevices.entrySet()) {
            String deviceName = entry.getKey();
            SmartDevice originalDevice = entry.getValue();
            SmartDevice copyDevice = copyDevices.get(deviceName);
            assertNotNull(copyDevice);
            // Assuming Device class implements the clone method correctly
            assertEquals(originalDevice, copyDevice);
        }


        assertEquals(casaInteligente.getLocations(),casainteligente1.getLocations(),"locations diferentes");

    }

    @Test
    void existsDeviceTest() {
        assertTrue(casaInteligente.existsDevice(camera.getID()) == true, "Erro ao verificar se existia um dispositivo");
    }

    @Test
    void addDeviceTest() {
        assertTrue(casaInteligente.getDevices().isEmpty() == false, "Erro ao adicionar dispositivo");
    }

/*
    @Test
    void setAllOnTest(){
        casaInteligente.addRoom("sala");
        SmartCamera smartCamera = new SmartCamera();
        SmartBulb smartBulb = new SmartBulb();
        SmartSpeaker smartSpeaker = new SmartSpeaker();
        casaInteligente.addDevice(smartCamera);
        casaInteligente.addDevice(smartBulb);
        casaInteligente.addDevice(smartSpeaker);
        casaInteligente.addToRoom("sala",smartCamera.getID());
        casaInteligente.addToRoom("sala",smartBulb.getID());
        casaInteligente.addToRoom("sala",smartSpeaker.getID());
        casaInteligente.setAllOn("sala",true);
        assertSame(SmartDevice.Modo.ON,smartCamera.getModo(), "Erro ao ligar o dispositivo tipo Camera");
        assertSame(SmartDevice.Modo.ON,smartBulb.getModo(), "Erro ao ligar o dispositivo tipo lampada");
        assertSame(SmartDevice.Modo.ON,smartSpeaker.getModo(), "Erro ao ligar o dispositivo tipo microfone");
    }
*/
    @Test
    void existsRoomsTest() {
        assertTrue(true == casaInteligente.existsRooms(), "Erro ao verificar se existia divisoes");
    }
    /*
    @Test
    void addRoomsTest() {

        assertEquals(1, casaInteligente.getLocations().size(), "Erro a adicionar divisoes");
    }
    */


    @Test
    void hasRoomTest() {
        casaInteligente.addRoom("sala");
        assertTrue(true == casaInteligente.hasRoom("sala"));
    }
    /*
    @Test
    void addToRoomTest() {
        casaInteligente.addRoom("sala");
        SmartCamera smartCamera = new SmartCamera();
        SmartBulb smartBulb = new SmartBulb();
        SmartSpeaker smartSpeaker = new SmartSpeaker();
        casaInteligente.addToRoom("sala", smartCamera.getID());
        casaInteligente.addToRoom("sala", smartBulb.getID());
        casaInteligente.addToRoom("sala", smartSpeaker.getID());
        assertEquals(3, casaInteligente.getLocations().get("sala").size(), "Erro ao adicionar dispositovos na divisão");
    }
*/
    @Test
    void roomHasDeviceTest() {
        casaInteligente.addRoom("sala");
        SmartCamera smartCamera = new SmartCamera();
        SmartBulb smartBulb = new SmartBulb();
        SmartSpeaker smartSpeaker = new SmartSpeaker();
        casaInteligente.addToRoom("sala", smartCamera.getID());
        casaInteligente.addToRoom("sala", smartBulb.getID());
        casaInteligente.addToRoom("sala", smartSpeaker.getID());
        assertTrue(casaInteligente.roomHasDevice("sala", smartCamera.getID()) == true, "Erro ao verificar se a sala tinha camara");
        assertTrue(casaInteligente.roomHasDevice("sala", smartBulb.getID()) == true, "Erro ao verificar se a sala tinha lampada");
        assertTrue(casaInteligente.roomHasDevice("sala", smartSpeaker.getID()) == true, "Erro ao verificar se a sala tinha micro");
    }
}