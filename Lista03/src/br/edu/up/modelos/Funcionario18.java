package br.edu.up.modelos;
import java.util.Scanner;

public class Funcionario18 {
    private String nome;
    private double salariofixo;
    private String sexo;
    private int idade;

    public Funcionario18(String nome, double salariofixo, String sexo, int idade){
        this.nome = nome;
        this.salariofixo = salariofixo;
        this.sexo = sexo;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalariofixo() {
        return salariofixo;
    }
    public void setSalariofixo(double salariofixo) {
        this.salariofixo = salariofixo;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Scanner getLeitor() {
        return leitor;
    }
    public void setLeitor(Scanner leitor) {
        this.leitor = leitor;
    }
    Scanner leitor = new Scanner(System.in);

    public double receberSalario(){
        
        if (sexo=="M"||sexo=="m") {
            if (idade<30) {
                salariofixo = salariofixo + 50;
            }
            else{
                salariofixo = salariofixo + 100;
            }
            
        }
        else{
            if (idade < 30) {
                salariofixo = salariofixo + 80;
                
            }
            else{
                salariofixo = salariofixo + 100;
            }
        }
        return salariofixo;
    }
    public String escreverNome() {
        return "Funcionario: "+ nome;
    }
}
