package br.com.ufam.conversor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorCelsiusTest {

    private Conversor_temp conversorTestF1;
    private Conversor_temp conversorTestF2;
    private Conversor_temp conversorTestC1;
    private Conversor_temp conversorTestC2;

    @BeforeEach
    public void setup(){
        conversorTestF1 = new Conversor_temp('F', 32);
        conversorTestF2 = new Conversor_temp('F', 104);
        conversorTestC1 = new Conversor_temp('C', 10);
        conversorTestC2 = new Conversor_temp('C', 40);
    }

    @Test
    public void testeFahrenheitCelsius1() {
        conversorTestF1.converter('C');

        assertEquals(conversorTestF1.getTemp().getTemperatura(), 0.00);
    }

    @Test
    public void testeCelsiusFahrenheit1() {
        conversorTestC1.converter('F');

        assertEquals(conversorTestC1.getTemp().getTemperatura(), 50.00);
    }

    @Test
    public void testeFahrenheitCelsius2() {
        this.conversorTestF2.converter('C');

        assertEquals(conversorTestF2.getTemp().getTemperatura(), 40.00);
    }

    @Test
    public void testeCelsiusFahrenheit2() {
        conversorTestC2.converter('F');

        assertEquals(conversorTestC2.getTemp().getTemperatura(), 104.00);
    }
}