package br.edu.up.exercicios;
import br.edu.up.modelos.Carango;
//A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto.
// Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros.
// O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000- 12% e acima de 2000 - 7%.
// O sistema deverá perguntar se deseja continuar 
//calculando desconto até que a resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral

public class Exercicio_12 {
    public static void executar(){

        Carango concessionaria = new Carango();
        concessionaria.calcularDesconto();
        concessionaria.mostrarTotais();
       
    }
    
}
