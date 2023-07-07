package principal;

import com.sun.tools.javac.Main;
import modelo.Funcionario;

public class FuncionarioMain {
    public static void main(String[] args) {
        /*Escreva uma classe que usa a classe desenvolvida no exercício 7 e dentro do método main crie
        três funcionários com nomes João, Mateus e Lucas. João trabalhou 20 horas a R$3,50 a hora. Mateus
        trabalhou 40 horas a R$5,50 a hora. Lucas trabalhou 40 horas a R$13,50 a hora. Depois imprime os
        nomes e salários dos três funcionários.*/
        Funcionario funcionario1 = new Funcionario("João", 20, 3.50);
        Funcionario funcionario2 = new Funcionario("Mateus", 40, 5.50);
        Funcionario funcionario3 = new Funcionario("Lucas", 40, 13.50);
        System.out.println("Nome: " + funcionario1.getNome() + " Salário: " + funcionario1.calcularSalario());
        System.out.println("Nome: " + funcionario2.getNome() + " Salário: " + funcionario2.calcularSalario());
        System.out.println("Nome: " + funcionario3.getNome() + " Salário: " + funcionario3.calcularSalario());
    }
}
