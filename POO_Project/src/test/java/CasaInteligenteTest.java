package src.test.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.*;

import static org.junit.jupiter.api.Assertions.*;


class CasaInteligenteTest {

    CasaInteligente casaInteligente;
    Comercializador comercializador;

    @BeforeEach
    public void setup() {
        comercializador = new Comercializador();
        casaInteligente = new CasaInteligente("casa1", 1, comercializador);
    }

    @Test
    void setDeviceOnTest() {
        SmartCamera smartCamera = new SmartCamera();
        casaInteligente.addDevice(smartCamera);
        casaInteligente.setDeviceOn(smartCamera.getID());
        assertSame(SmartDevice.Modo.ON, smartCamera.getModo(), "Erro ao ligar o dispositivo tipo Camera");
    }

    @Test
    void existsDeviceTest() {
        SmartCamera smartCamera = new SmartCamera();
        casaInteligente.addDevice(smartCamera);
        assertTrue(casaInteligente.existsDevice(smartCamera.getID()) == true, "Erro ao verificar se existia um dispositivo");
    }

    @Test
    void addDeviceTest() {
        SmartCamera smartCamera = new SmartCamera();
        casaInteligente.addDevice(smartCamera);
        assertTrue(casaInteligente.getDevices().isEmpty() == false, "Erro ao adicionar dispositivo");
    }


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

    @Test
    void existsRoomsTest() {
        casaInteligente.addRoom("sala");
        assertTrue(true == casaInteligente.existsRooms(), "Erro ao verificar se existia divisoes");
    }

    @Test
    void addRoomsTest() {
        casaInteligente.addRoom("sala");
        assertEquals(1, casaInteligente.getLocations().size(), "Erro a adicionar divisoes");
    }

    @Test
    void hasRoomTest() {
        casaInteligente.addRoom("sala");
        assertTrue(true == casaInteligente.hasRoom("sala"));
    }

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