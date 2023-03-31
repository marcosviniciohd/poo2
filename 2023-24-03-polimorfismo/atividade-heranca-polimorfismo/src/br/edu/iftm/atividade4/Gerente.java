package br.edu.iftm.atividade4;

public class Gerente extends Funcionario{

    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }

    public Gerente() {
    }

    @Override
    public double calcularSalario(double valorPagoPorHora, int horasTrabalhadas){
        System.out.println("Cargo: Gerente recebe boniticacao de 10%");
        return (valorPagoPorHora * horasTrabalhadas) * 1.0;
    }

}
