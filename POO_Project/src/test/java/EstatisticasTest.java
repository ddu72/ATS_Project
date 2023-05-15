package test.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.java.*;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;
import static main.java.SmartDevice.Modo.OFF;
import static main.java.SmartDevice.Modo.ON;


public class EstatisticasTest{
    Estatisticas estatisticas;
    CasaInteligente casaInteligente;
    Comercializador comercializador;
    Periodo periodo;

    @BeforeEach
    public void setup() {
        Map<Integer, CasaInteligente> casas = new HashMap<Integer, CasaInteligente>();
        Map<String,Comercializador> comercializadores = new HashMap<String, Comercializador>();
        List<Periodo> periodos = new ArrayList<Periodo>();

        estatisticas = new Estatisticas(casas,comercializadores,periodos);
    }

    @Test
    public void testConstrutor(){
        assertNotNull(estatisticas);
    }






}
