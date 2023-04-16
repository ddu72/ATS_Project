package ATS_Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Comercializador;
import src.*;

import static org.junit.jupiter.api.Assertions.*;

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