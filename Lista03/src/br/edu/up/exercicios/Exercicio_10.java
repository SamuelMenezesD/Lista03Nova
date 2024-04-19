package br.edu.up.exercicios;
import br.edu.up.modelos.Idade;
import java.util.Scanner;
//Faça um programa que receba a idade de um número finito de pessoas e mostre mensagem informando
// “maior de idade” e “menor de idade” para cada pessoa. Considerar a pessoa com 18anos como maior de idade
public class Exercicio_10 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        Idade idade = new Idade(0);

        System.out.println("Digite o numero de pessoas: ");
        int numpessoas = leitor.nextInt();


        for (int i = 1; i <= numpessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade.setVlridade(leitor.nextInt());
            
            System.out.println(idade.verificarMaioridade());
        }


        leitor.close();
    }
    
}
