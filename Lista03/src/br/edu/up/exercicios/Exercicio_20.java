package br.edu.up.exercicios;
import br.edu.up.modelos.EscolaAprender;
//A escola “APRENDER” faz o pagamento de seus professores por hora/aula. 
//Faça um programa que calcule e exiba o salário de um professor. 
//Sabe-se que o valor da hora/aula segue a tabela abaixo:
//Professor Nível 1 R$12,00 por hora/aula
//Professor Nível 2 R$17,00 por hora/aula
//Professor Nível 3 R$25,00 por hora/aula

import java.util.Scanner;

public class Exercicio_20 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        EscolaAprender escolaAprender = new EscolaAprender(0, 0);

        System.out.println("Insira o nivel do medico (niveis: 1, 2, 3)");
        escolaAprender.setNivel(leitor.nextInt());

        System.out.println("Insira o numero de horas trabalhadas do professor: ");
        escolaAprender.setHoraprof(leitor.nextInt());
        
        System.out.println(escolaAprender.calcularProf());

        leitor.close();
    
    }
}
