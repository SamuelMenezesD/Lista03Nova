package br.edu.up.exercicios;
import br.edu.up.modelos.Parcelas;
import java.util.Scanner;
//A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) 
//prestações sem juros.Faça um programa que receba um valor de uma compra e mostre o valor das prestações
public class Exercicio_05 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Parcelas parcelas = new Parcelas(0);

        System.out.println("Informe o valor da compra: ");
        parcelas.setVlrcompra(leitor.nextDouble());

        System.out.println("O valor de cada uma das cinco parcelas é de: "+parcelas.prestacaoSemjuros()); 

        leitor.close();
    }
    
}
