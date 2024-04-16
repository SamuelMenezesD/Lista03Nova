package br.edu.up.modelos;
public class Automovel {
    private double distancia;
    private double combustivelgasto;

    public Automovel (double distancia, double combustivelgasto){
        this.distancia = distancia;
        this.combustivelgasto = combustivelgasto;
    }
    public double calcularMedia(){
        return distancia / combustivelgasto;
    }
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public double getCombustivelgasto() {
        return combustivelgasto;
    }
    public void setCombustivelgasto(double combustivelgasto) {
        this.combustivelgasto = combustivelgasto;
    }
    
    
}
