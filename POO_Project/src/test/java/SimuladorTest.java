package src.test.java;
import src.test.java.*;
import src.main.java.Simulador;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;


public class SimuladorTest {

    @Test
    void testeConstrutor() {
        LocalDate time = LocalDate.now();
        Simulador sim = new Simulador();
        assertNotNull(sim, "Erro ao criar o Simulador");
        sim = new Simulador(true);
        assertNotNull(sim, "Erro ao criar o Simulador");
        sim = new Simulador(time);
        assertNotNull(sim, "Erro ao criar o Simulador");
    }
}