package test.java;//package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import main.java.*;


public class SmartDeviceTest {

    SmartDevice smartDevice;
    SmartDevice smartDevice1;
    SmartDevice smartDevice2;
    SmartDevice smartDevice3;

    @BeforeEach
    public void setUp(){



    }

    @AfterEach
    public void tearDown(){}

    @Test
    public void testeConstrutor(){
        Simulador simulador = new Simulador();
        //SmartDevice smartDevice1 = new SmartDevice();
        //assertNotNull(smartDevice1, "Erro ao criar a SmartBulb");
        //smartDevice1 = new SmartDevice(simulador, "smartDevide1", 5);


    }



















}