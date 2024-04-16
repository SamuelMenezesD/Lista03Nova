package br.edu.up.exercicios;
import br.edu.up.modelos.Vendedor;
import java.util.Scanner;
// Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
// por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de 
//comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.
public class Exercicio_03 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Vendedor vendedor = new Vendedor(null, 0, 0);

        System.out.println("Informe o nome do vendedor: ");
        vendedor.setNome(leitor.nextLine());

        System.out.println("Insira o salario fixo do vendedor: ");
        vendedor.setSalario(leitor.nextDouble());
        System.out.println("Isira total em vendas do vendedor: ");
        vendedor.setTotalvendas(leitor.nextDouble());

        System.out.println("Nome do vendedor: "+ vendedor.getNome());
        System.out.println("Salario: " + vendedor.getSalario());
        System.out.println("Salario final: "+ vendedor.salarioTotal());

        leitor.close();
    }
    
}
