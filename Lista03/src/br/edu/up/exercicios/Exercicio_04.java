package br.edu.up.exercicios;
import java.util.Scanner;
import br.edu.up.modelos.CotacaoDolar;

//Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$)
// O programa deverá solicitar o valor da cotação do dólar e também aquantidade de dólares disponíveis com o usuário

public class Exercicio_04 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        CotacaoDolar cotacaodolar =  new CotacaoDolar(0, 0);

        System.out.println("Insira a cotação do dolar: ");
        cotacaodolar.setCotacao(leitor.nextDouble());

        System.out.println("Insira a quantidade de dolares disponiveis: ");
        cotacaodolar.setQuantdolar(leitor.nextDouble());
        
        System.out.println("O valor para Reais é: "+ cotacaodolar.converReal());

        leitor.close();


    }
    
}
