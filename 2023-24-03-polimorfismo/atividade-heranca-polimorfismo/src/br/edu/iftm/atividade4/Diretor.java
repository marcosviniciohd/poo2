package br.edu.iftm.atividade4;

public class Diretor extends Funcionario{

    public Diretor(String nome, String cpf) {
        super(nome, cpf);
    }

    public Diretor() {
    }

    @Override
    public double calcularSalario(double valorPagoPorHora, int horasTrabalhadas){
        System.out.println("Cargo: Diretor recebe boniticacao de 15%");
        return (valorPagoPorHora * horasTrabalhadas) * 1.5;
    }

}

