package br.edu.up.exercicios;
import br.edu.up.modelos.Nadador;

import java.util.Scanner;

// Elabore um programa que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
//Infantil A = 5 - 7 anosInfantil
//B = 8 - 10 anosjuvenil 
//A = 11- 13 anosjuvenil
//B = 14 - 17 anos
//Sênior = 18 - 25 anos
//Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado
public class Exercicio_21 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Nadador nadador = new Nadador(0);

        System.out.println("Insira a idade do nadador: ");
        nadador.setIdade(leitor.nextInt());

        System.out.println(nadador.categoriaIdade());



        leitor.close();
    }
    
}
