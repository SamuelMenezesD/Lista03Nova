package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Aluno25;
//Dado o nome de um estudante, com o respectivo número de matrícula e as três notas acima mencionadas,
// desenvolva um programa para calcular a nota final e a classificação de cada estudante.
// A classificação é dada conforme a lista abaixo:
//Nota Final Classificação
//[8,10] A
//[7,8] B
//[6,7] C
//[5,6] D
//[0,5] R
//RImprima o nome do estudante, com o seu número, nota final e classificação.
public class Exercicio_25 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Aluno25 aluno25 = new Aluno25(null, null, 0, 0, 0);

        System.out.println("Insira o nome do estudante: ");
        aluno25.setNome(leitor.nextLine());

        System.out.println("Insira o numero do estudante: ");
        aluno25.setMatricula(leitor.nextLine());

        System.out.println("Insira a nota do laboratorio: ");
        aluno25.setNtlab(leitor.nextDouble());

        System.out.println("Insira a nota da avaliação semestral: ");
        aluno25.setNtav(leitor.nextDouble());

        System.out.println("Insira a nota do exame final: ");
        aluno25.setNtexfinal(leitor.nextDouble());

        System.out.println("O aluno " +  aluno25.nomeAluno());
        System.out.println("De matricula: " + aluno25.matriculaAluno());
        System.out.println("Teve como media: " + aluno25.getNotafinal());
        System.out.println("Ficando na classificação: " + aluno25.classificacao());


        leitor.close();
    }
    
}
