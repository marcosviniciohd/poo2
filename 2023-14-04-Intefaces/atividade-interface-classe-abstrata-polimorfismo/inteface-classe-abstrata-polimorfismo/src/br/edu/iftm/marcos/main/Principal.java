package br.edu.iftm.marcos.main;

import br.edu.iftm.marcos.model.Assistente;
import br.edu.iftm.marcos.model.Funcionario;
import br.edu.iftm.marcos.model.Gerente;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Marcos", "123", 1000, 2.0);
        Funcionario assistente = new Assistente("João", "456", 1000, 1.0);
        Funcionario vendedor = new Assistente("Maria", "789", 1000, 1.5);

        List<Funcionario> funcionarios = List.of(gerente, assistente, vendedor);
        funcionarios.forEach(f -> System.out.println("Salários dos funcionários somados é: " + f.calculaSalario()));

    }
}
