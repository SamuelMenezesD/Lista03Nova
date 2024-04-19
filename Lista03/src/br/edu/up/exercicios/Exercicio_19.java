package br.edu.up.exercicios;
import br.edu.up.modelos.Triangulo;
import java.util.Scanner;
//Escrever um programa que leia três valores inteiros e verifique se eles podem ser os lados deum triângulo. 
//Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ouescaleno.
public class Exercicio_19 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Triangulo triangulo = new Triangulo(0, 0, 0);
        System.out.println("Informe o lado 1 do triangulo: ");
        triangulo.setLado1(leitor.nextInt());

        System.out.println("Informe o lado 2 do triangulo: ");
        triangulo.setLado2(leitor.nextInt());

        System.out.println("Informe o lado 3 do triangulo: ");
        triangulo.setLado3(leitor.nextInt());

        System.out.println(triangulo.tipoTriangulo());

        leitor.close();

    }
    
}
