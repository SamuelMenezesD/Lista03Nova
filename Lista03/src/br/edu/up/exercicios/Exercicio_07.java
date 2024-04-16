package br.edu.up.exercicios;
import br.edu.up.modelos.CarroNovo;
import java.util.Scanner;
//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem dodistribuidor
// e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, 
//e depois apercentagem do distribuidor sobre o resultado). 
//Supondo que a percentagem do distribuidor sejade 28% e os impostos 45%. 
//Escrever um programa que leia o custo de fábrica de um carro e informeo custo ao consumidor do mesmo.

public class Exercicio_07 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        CarroNovo carronovo = new CarroNovo(0);

        System.out.println("Digite o custo de fabrica do carro: ");
        carronovo.setCustofabrica(leitor.nextDouble());
        
        System.out.println("O valor final do carro é de: " + carronovo.custoComimposto() );

        leitor.close();
    }
    
}
