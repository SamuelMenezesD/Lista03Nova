package br.edu.up.exercicios;
import br.edu.up.modelos.ReajusteFuncionario;
//Escrever um programa para uma empresa que decide dar um reajuste a seus 584 funcionáriosde acordo com os 
//seguintes critérios:
//a) 50% para aqueles que ganham menos do que três salários mínimos;
//b) 20% para aqueles que ganham entre três até dez salários mínimos;
//c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;
//d) 10% para os demais funcionários.

public class Exercicio_16 {
    public static void executar() {

        ReajusteFuncionario reajusteFuncionario = new ReajusteFuncionario();
        
        reajusteFuncionario.receberSalario();
        
    }
}
