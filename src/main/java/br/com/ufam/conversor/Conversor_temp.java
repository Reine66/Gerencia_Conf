package br.com.ufam.conversor;

public class Conversor_temp{
    private Temperatura temp;

    public Conversor_temp(char escala, double temperatura){
        this.temp = new Temperatura(temperatura);
    }

    public Temperatura getTemp(){
        return this.temp;
    }

    public void celsiusParaFahrenheit(){
        double Celsius, Fahrenheit;

        Celsius = this.getTemp().getTemperatura();
        Fahrenheit = (( 9.0 / 5.0 ) * Celsius) + 32.0;

        this.getTemp().setTemperatura(Fahrenheit);
        System.out.println("----------------------------");
        System.out.printf("Temperatura: %.2f ºC\n", Celsius);
        System.out.println("O valor é:");
        System.out.printf("Temperatura: %.2f ºF\n", this.getTemp().getTemperatura());
    }

    public void fahrenheitParaCelsius(){
        double Fahrenheit, Celsius;

        Fahrenheit = this.getTemp().getTemperatura();
        Celsius = (Fahrenheit - 32.0) * ( 5.0 / 9.0 );

        this.getTemp().setTemperatura(Celsius);
        System.out.println("----------------------------");
        System.out.printf("Temperatura: %.2f ºF\n", Fahrenheit);
        System.out.println("O valor é:");
        System.out.printf("Temperatura: %.2f ºC\n", this.getTemp().getTemperatura());
    }

    public void converter(char escalaParaConverter){

        switch(escalaParaConverter){
            case 'C':
                this.fahrenheitParaCelsius();
                break;
            case 'F':
                this.celsiusParaFahrenheit();
                break;
        }
    }
}
