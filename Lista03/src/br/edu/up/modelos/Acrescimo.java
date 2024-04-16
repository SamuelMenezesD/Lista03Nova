package br.edu.up.modelos;
public class Acrescimo {
    private double custo;
    private double acrescimovlr;

    public Acrescimo(double custo, double acrescimovlr){

        this.acrescimovlr = acrescimovlr;

        this.custo = custo;
    }
    public double vlrProduto(){
        
        return custo*acrescimovlr/100;
    }
    public double getCusto() {
        return custo;
    }
    public void setCusto(double custo) {
        this.custo = custo;
    }
    public double getAcrescimovlr() {
        return acrescimovlr;
    }
    public void setAcrescimovlr(double acrescimovlr) {
        this.acrescimovlr = acrescimovlr;
    }

    
}
