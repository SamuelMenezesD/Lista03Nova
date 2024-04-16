package br.edu.up.modelos;

public class Parcelas {
    private double vlrcompra;

    public Parcelas (double vlrcompra){
        this.vlrcompra = vlrcompra;
    }

    public double prestacaoSemjuros(){
        return vlrcompra /5;
    }

    public double getVlrcompra() {
        return vlrcompra;
    }

    public void setVlrcompra(double vlrcompra) {
        this.vlrcompra = vlrcompra;
    }
    
}
