package br.edu.up.modelos;

public class Idade {
    private int vlridade;
    
    public Idade (int vlridade){
        this.vlridade = vlridade;
    }
    public String verificarMaioridade() {
        if (vlridade >= 18) {
            return "Maior de idade";
        } else {
            return "Menor de idade";
        }
    }
    public int getVlridade() {
        return vlridade;
    }
    public void setVlridade(int vlridade) {
        this.vlridade = vlridade;
    }




}
