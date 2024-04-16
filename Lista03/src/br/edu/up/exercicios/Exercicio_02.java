//Escrever um programa para determinar o consumo médio de um automóvel 
//sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.
package br.edu.up.exercicios;
import br.edu.up.modelos.Automovel;
import java.util.Scanner;

public class Exercicio_02 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Automovel automovel = new Automovel(0, 0);
        System.out.println("Insira a distancia percorrida: ");
        automovel.setDistancia(leitor.nextDouble());

        System.out.println("Insira o total de combustivel gasto: ");
        automovel.setCombustivelgasto(leitor.nextDouble());


        System.out.println("O consumo medio do carro é: "+ automovel.calcularMedia());

        leitor.close();


    }
    
}
