package br.edu.up.exercicios;
import br.edu.up.modelos.Peso23;
import java.util.Scanner;

public class Exercicio_23 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Peso23 peso23 = new Peso23(null, null, 0, 0);

        System.out.print("Digite o nome da pessoa: ");
        peso23.setNome(leitor.nextLine());

        System.out.print("Digite o sexo da pessoa (M/F): ");
        peso23.setSexo(leitor.nextLine());

        System.out.print("Digite a altura da pessoa: ");
        peso23.setAltura(leitor.nextDouble());

        System.out.print("Digite a idade da pessoa: ");
        peso23.setIdade(leitor.nextInt(0));

        System.out.println(peso23.escreverNome());
        System.out.println("O seu peso ideal é: " + peso23.contaPeso());

        leitor.close();
    }
    
}
