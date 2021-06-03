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
        double tempCelsius, tempFahrenheit;

        tempCelsius = this.getTemp().getTemperatura();
        tempFahrenheit = (1.8 * tempCelsius) + 32.0;

        this.getTemp().setTemperatura(tempFahrenheit);
        System.out.printf("Temperatura: %.2f ºC\n", tempCelsius);
        System.out.println("O valor é:");
        System.out.printf("Temperatura: %.2f ºF\n", this.getTemp().getTemperatura());
    }

   
    public void fahrenheitParaCelsius(){
        double tempFahrenheit, tempCelsius;

        tempFahrenheit = this.getTemp().getTemperatura();
        tempCelsius = (tempFahrenheit - 32.0) / 1.8;

        this.getTemp().setTemperatura(tempCelsius);
        System.out.printf("Temperatura: %.2f ºF\n", tempFahrenheit);
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
