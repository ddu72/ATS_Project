package test.java;
import main.java.*;
import main.java.Simulador;
import java.io.*;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

import javax.ejb.Local;

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
        Simulador sim2 = new Simulador(sim);
        assertNotNull(sim2);
    }

    @Test
    public void testConstruirSimulador(){
        String f_falso = "dirTest";
        Simulador sim = new Simulador();
        assertNull(sim.construirSimulador(f_falso));

        String filePath = "presets_obj/preset1"; // Replace with the actual file path
        try {
            FileInputStream fi = new FileInputStream(filePath);
            ObjectInputStream oi = new ObjectInputStream(fi);

            Simulador simulador = (Simulador) oi.readObject();
            simulador.setFaseInicial(false);

            fi.close();
            oi.close();

            // Step 3: Assert the expected result
            // For example, check if the object is not null
            assertNotNull(simulador);
            // or assert against specific properties of the object
            assertFalse(simulador.getFaseInicial());
        } catch (IOException | ClassNotFoundException e) {
            // Handle any exceptions that may occur during reading
            e.printStackTrace();
        }
    }

    @Test
    public void testSaltadias(){
        LocalDate i = LocalDate.of(2023,1,1);
        LocalDate f = LocalDate.of(2023,1,31);
        Simulador sim = new Simulador(i);
        sim.saltarDias(f);


    }


}