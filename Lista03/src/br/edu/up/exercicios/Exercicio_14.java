package br.edu.up.exercicios;
import br.edu.up.modelos.PrecoProdutos;
//Faça um programa que receba o preço de custo e o preço de venda de 40 produtos.
// Mostre como resultado se houve lucro, 
//prejuízo ou empate para cada produto. Informe média de preço decusto e do preço de venda
public class Exercicio_14 {
    public static void executar(){
        PrecoProdutos precoProdutos = new PrecoProdutos();
        precoProdutos.calcularLucroOuPrejuizo();
        precoProdutos.calcularMediaPrecos();
    }
}
