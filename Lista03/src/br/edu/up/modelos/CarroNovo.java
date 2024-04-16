package br.edu.up.modelos;
public class CarroNovo {
    private double custofabrica;

    public CarroNovo(double custofabrica){
        this.custofabrica = custofabrica;
    }

    public double custoComimposto(){
        
        return (custofabrica * 45/100) * 28/100;
    }

    public double getCustofabrica() {
        return custofabrica;
    }

    public void setCustofabrica(double custofabrica) {
        this.custofabrica = custofabrica;
    }
    
}
