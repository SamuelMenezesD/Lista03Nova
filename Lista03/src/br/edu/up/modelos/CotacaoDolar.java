public class CotacaoDolar {
    private double cotacao;
    private double quantdolar;

    public CotacaoDolar (double cotacao, double quantdolar){
        this.cotacao = cotacao;

        this.quantdolar = quantdolar;
    }
    public double converReal(){
        
        return quantdolar*cotacao;
    }
    public double getCotacao() {
        return cotacao;
    }
    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }
    public double getQuantdolar() {
        return quantdolar;
    }
    public void setQuantdolar(double quantdolar) {
        this.quantdolar = quantdolar;
    }
    
    
}
