package br.edu.up.exercicios;
import br.edu.up.modelos.PessoaGeneroContador;
import java.util.Scanner;
//Escrever um programa que leia o nome e o sexo de 
//56 pessoas e informe o nome e se ela é homem ou mulher. No final informe total de homens e de mulheres.
public class Exercicio_11 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        PessoaGeneroContador pessoaGeneroContador = new PessoaGeneroContador();

        System.out.println(pessoaGeneroContador.contarSexo());

        leitor.close();
    }
}
