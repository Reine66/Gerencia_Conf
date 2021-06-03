package br.com.ufam.conversor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorCelsiusTest {

    private Conversor_temp conversorTest;
    private Conversor_temp conversorTestF;

    @BeforeEach
    public void setup(){
        conversorTest = new Conversor_temp('C', 10);
        conversorTestF = new Conversor_temp('F', 32);
    }

    @Test
    public void testeConvertendoDeCelsiusParaFahrenheit() {
        conversorTest.converter('F');

        assertEquals(conversorTest.getTemp().getTemperatura(), 50.00);
    }

    @Test
    public void testeConvertendoDeFahrenheitParaCelsius() {
        conversorTestF.converter('C');
        
        assertEquals(conversorTestF.getTemp().getTemperatura(), 0.00);
    }
}