package test.java;
import main.java.*;

import org.junit.jupiter.api.*;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static main.java.SmartDevice.Modo.OFF;

class ComercializadorTest {

    Comercializador comercializador;

    @BeforeEach
    public void setup(){
        comercializador = new Comercializador();
    }


    @Test
    void precoDiaPorDispositivoTest(){
        Comercializador comercializador1 = new Comercializador("José",10,20);
        SmartCamera smartCamera = new SmartCamera();
    }
}