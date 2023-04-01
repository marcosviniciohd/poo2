package br.edu.iftm.estudante.pkg04;

public class App {
    public static void main(String[] args){
        Assistente assistente = new Assistente(1000, 8);
        System.out.println(assistente.calcularSalario());

        Gerente gerente = new Gerente(1000, 8);
        System.out.println(gerente.calcularSalario());

        Diretor diretor = new Diretor(1000, 8);
        System.out.println(diretor.calcularSalario());
    }
}
