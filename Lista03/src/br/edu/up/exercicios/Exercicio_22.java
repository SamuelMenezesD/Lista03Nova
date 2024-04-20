package br.edu.up.exercicios;
import br.edu.up.modelos.ContaLuz;
import java.util.Scanner;
//Faça um programa que calcule o valor da conta de luz de uma pessoa.
// Sabe-se que o cálculoda conta de luz segue a tabela abaixo:
//Tipo de Cliente Valor do KW/h
//1 (Residência) 0,60
//2 (Comércio) 0,48
//3 (Indústria) 1,29
public class Exercicio_22 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        ContaLuz contaLuz = new ContaLuz(0, 0);

        System.out.print("Digite o tipo de cliente (1 para residencia, 2 para comercio, 3 para industria): ");
        contaLuz.setTipo(leitor.nextInt());

        System.out.print("Digite a quantidade de KW/h consumidos: ");
        contaLuz.setConsumo(leitor.nextDouble());

        System.out.println("Valor da conta de luz: R$" + contaLuz.calcularValorConta() );

        leitor.close();
        

    }
    
}
