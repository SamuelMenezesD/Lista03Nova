package br.edu.up.modelos;
import java.util.Scanner;

public class Funcionario17 {
    private double salario;
    private String nome;

    double reajuste;

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getReajuste() {
        return reajuste;
    }
    public void setReajuste(double reajuste) {
        this.reajuste = reajuste;
    }
    public Funcionario17(double salario, String nome){
        this.nome = nome;
        this.salario = salario;
    }
    public double salarioFinal(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe valor do reajuste em porcentagem: ");
        reajuste = leitor.nextDouble();

        double salariofinal = salario + salario * reajuste;

        leitor.close();
        return salariofinal;

    }
    public double reajusteValor(){
        return reajuste;
    }
    public String getNome(){
        return nome;
    }
    
}
