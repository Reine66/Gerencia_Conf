package br.com.ufam.conversor;

public class Conversor_temp{
    private Temperatura temp;

    public Conversor_temp(char escala, double temperatura){
        this.temp = new Temperatura(escala, temperatura);

        System.out.printf("Temperatura: %.2f *%c\n", this.getTemp().getTemperatura(), this.getTemp().getEscala());
    }

    public Temperatura getTemp(){
        return this.temp;
    }

    public void celsiusParaFahrenheit(){
        double tempCelsius, tempFahrenheit;

        tempCelsius = this.getTemp().getTemperatura();
        tempFahrenheit = (1.8 * tempCelsius) + 32.0;

        this.getTemp().setEscala('F');
        this.getTemp().setTemperatura(tempFahrenheit);
        System.out.printf("Temperatura: %.2f *%c\n", this.getTemp().getTemperatura(), this.getTemp().getEscala());
    }

   
    public void fahrenheitParaCelsius(){
        double tempFahrenheit, tempCelsius;

        tempFahrenheit = this.getTemp().getTemperatura();
        tempCelsius = (tempFahrenheit - 32.0) / 1.8;

        this.getTemp().setEscala('C');
        this.getTemp().setTemperatura(tempCelsius);
        System.out.printf("Temperatura: %.2f *%c\n", this.getTemp().getTemperatura(), this.getTemp().getEscala());
    }

    public void converter(char escalaParaConverter){
        System.out.println("Convertendo...");

        switch(escalaParaConverter){
            case 'C':
                if(this.getTemp().getEscala()=='K') this.kelvinParaCelsius();
                else if(this.getTemp().getEscala()=='F') this.fahrenheitParaCelsius();
                break;
            case 'F':
                if(this.getTemp().getEscala()=='C') this.celsiusParaFahrenheit();
                else if(this.getTemp().getEscala()=='K') this.kelvinParaFahrenheit();
                break;
        }
    }
}
