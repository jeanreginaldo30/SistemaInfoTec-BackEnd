package br.com.infotec.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraVendasTest {
    
    @Test
    public void testCalcularDesconto() {
        CalculadoraVendas calc = new CalculadoraVendas();
        double resultado = calc.calcularDesconto(100.0, 10.0);
        assertEquals(90.0, resultado, 0.001); 
    }
}