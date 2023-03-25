package br.edu.iftm.atividade2;

public class Vaca extends Animal {
    public Vaca(String nome, String som) {
        super(nome, som);
    }

    @Override
    public void emitirSom() {
        System.out.println();
        System.out.printf("Nome: %s%n", getNome());
        System.out.printf("Som: %s%n", getSom());
    }
}
