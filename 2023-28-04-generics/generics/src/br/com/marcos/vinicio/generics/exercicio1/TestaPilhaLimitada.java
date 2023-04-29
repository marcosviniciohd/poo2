package br.com.marcos.vinicio.generics.exercicio1;

public class TestaPilhaLimitada {
    public static void main(String[] args) {
        PilhaLimitada<String> pilha = new PilhaLimitada<>(5);
        pilha.empilhar("Marcos");
        pilha.empilhar("Vinicio");
        pilha.empilhar("Fernandes");
        pilha.empilhar("Daniela");
        pilha.empilhar("Junior");
        System.out.println(pilha.getTamanho());
        System.out.println(pilha.topo());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.topo());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.topo());

        if (pilha.estaVazia()) {
            System.out.println("Pilha vazia");
        } else {
            System.out.println("Pilha não vazia");
            System.out.println("Tamanho da pilha: " + pilha.tamanho());
        }

        System.out.println("=====================================");
        System.out.println("=====================================");


        PilhaLimitada<Integer> pilhaInt = new PilhaLimitada<>(5);
        pilhaInt.empilhar(1);
        pilhaInt.empilhar(2);
        pilhaInt.empilhar(3);
        pilhaInt.empilhar(4);
        pilhaInt.empilhar(5);
        System.out.println(pilhaInt.getTamanho());
        System.out.println(pilhaInt.topo());
        System.out.println(pilhaInt.desempilhar());
        System.out.println(pilhaInt.topo());

        /*System.out.println(pilha.desempilhar());
        System.out.println(pilha.topo());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.topo());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.topo());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.topo());
        System.out.println(pilha.desempilhar());*/
    }
}
