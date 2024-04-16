package br.edu.up.exercicios;
import br.edu.up.modelos.Acrescimo;
import java.util.Scanner;
//Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. 
//Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.

public class Exercicio_06 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Acrescimo acrescimo = new Acrescimo(0, 0);

        System.out.println("Informe o valor do custo: ");
        acrescimo.setCusto(leitor.nextDouble());
        System.out.println("Infome o percentual de acrescimo: ");
        acrescimo.setAcrescimovlr(leitor.nextDouble());

        System.out.println("O valor do produto com o acrescimo é de: "+ acrescimo.vlrProduto());
        
        leitor.close();
    }

    
}
