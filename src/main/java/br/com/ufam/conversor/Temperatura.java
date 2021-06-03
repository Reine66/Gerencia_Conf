package br.com.ufam.conversor;

public class Temperatura{
    private double temperatura;

    public Temperatura(double temperatura){
        this.setTemperatura(temperatura);
    }

    public double getTemperatura(){
        return this.temperatura;
    }

    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }
}
