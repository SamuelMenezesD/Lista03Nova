package br.edu.up.exercicios;
import br.edu.up.modelos.Funcionario18;
import java.util.Scanner;

public class Exercicio_18 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);
        
        Funcionario18 funcionario18 = new Funcionario18(null, 0, null, 0);

        System.out.println("Insira o sexo(M/H): ");
        funcionario18.setSexo(leitor.nextLine());

        System.out.println("Insira o nome: ");
        funcionario18.setNome(leitor.nextLine());
        
        System.out.println("Insira o salario: ");
        funcionario18.setSalariofixo(leitor.nextDouble());  
    
        System.out.println("Insira idade: ");
        funcionario18.setIdade(leitor.nextInt());
        
        System.out.println(funcionario18.escreverNome());
        System.out.println("O salario com abono é: "+ funcionario18.receberSalario());

        

        leitor.close();

    }
    
}
