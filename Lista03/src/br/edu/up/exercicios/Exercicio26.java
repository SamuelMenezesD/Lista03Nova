package br.edu.up.exercicios;

import java.util.Scanner;

public class Exercicio26 {

    public static void GerarApoliceSeguro(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("informe o seu grupo de risco (Baixo) (Medio) (Alto): ");
        String risco = scanner.nextLine();

        System.out.println("Informe a idade: ");
        int idade = scanner.nextInt();

        if(idade < 17 || idade > 70){

            System.out.println("Idade invalida para seguro ");
            return;

        }

        ImprimePessoa(nome, risco, idade);

        scanner.close();

    }

    private static void ImprimePessoa(String nome,String risco,int idade){

        System.out.println(String.format("Nome: %s Idade: %d Grupo de Risco: %s", nome,idade,risco));

    }
}
