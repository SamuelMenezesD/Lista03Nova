package br.edu.up.exercicios;
import br.edu.up.modelos.Alunoex08;
import java.util.Scanner;
//Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre.
//Calcular a sua média (aritmética),
// informar o nome e sua menção aprovado (media >= 7),Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9)
public class Exercicio_08 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Alunoex08 alunoex08 = new Alunoex08(null, 0, 0, 0);
        
        System.out.print("Digite o nome do aluno: ");
        alunoex08.setNome(leitor.nextLine());

        System.out.print("Digite a nota da primeira prova: ");
        alunoex08.setNot1(leitor.nextDouble());        

        System.out.print("Digite a nota da segunda prova: ");
        alunoex08.setNot2(leitor.nextDouble());        

        System.out.print("Digite a nota da terceira prova: ");
        alunoex08.setNot3(leitor.nextDouble());
        
        System.out.println("Nome: " + alunoex08.getNome());
        System.out.println("Situação: " + alunoex08.resultadoAptidao());

        leitor.close();
    }
    
}
