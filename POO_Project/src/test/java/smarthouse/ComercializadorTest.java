package smarthouse;
import smarthouse.*;
import java.util.Random;
import org.junit.jupiter.api.*;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static smarthouse.SmartDevice.Modo.OFF;

class ComercializadorTest {


    @Test
    void parseTest(){
        Random r = new Random();
        Comercializador comercializador = Comercializador.parse("Test Comercializador", r);

        // Assert the expected values
        assertNotNull(comercializador);
        assertEquals("Test Comercializador", comercializador.getNome());
        assertTrue(comercializador.getCustoDiarioKwh() >= 0.05 && comercializador.getCustoDiarioKwh() <= 0.15);
        assertTrue(comercializador.getFatorImpostos() >= 1 && comercializador.getFatorImpostos() <= 2);
    }
/*
    @Test
    void precoDiaPorDispositivoTest(){
        Comercializador comercializador1 = new Comercializador("José",10,20);
        SmartCamera cam = new SmartCamera(OFF, 10, 10, 100,100);
        comercializador1.precoDiaPorDispositivo(cam,comercializador1.getCustoDiarioKwh(),comercializador1.getFatorImpostos());
    }

 */
}