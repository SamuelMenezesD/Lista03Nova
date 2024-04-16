package br.edu.up.exercicios;
import java.util.Scanner;
import br.edu.up.modelos.Aluno;
public class Exercicio_01 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Aluno aluno = new Aluno(null, 0, 0, 0);

        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(leitor.nextLine());
        
        System.out.print("Digite a nota da primeira prova: ");
        aluno.setNota1(leitor.nextDouble());
        
        System.out.print("Digite a nota da segunda prova: ");
        aluno.setNota2(leitor.nextDouble());
        
        System.out.print("Digite a nota da terceira prova: ");
        aluno.setNota3(leitor.nextDouble());

        
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Media das notas: " + aluno.calcularMedia());

        leitor.close();
    }
    
}
