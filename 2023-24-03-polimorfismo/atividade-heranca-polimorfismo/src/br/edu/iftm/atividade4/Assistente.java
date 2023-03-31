package br.edu.iftm.atividade4;

public class Assistente extends Funcionario{

    public Assistente(String nome, String cpf) {
        super(nome, cpf);
    }

    public Assistente() {
    }

    @Override
    public double calcularSalario(double valorPagoPorHora, int horasTrabalhadas){
        System.out.println("Cargo: Assistente recebe boniticacao de 8%");
        return (valorPagoPorHora * horasTrabalhadas) * 0.8;
    }

}
