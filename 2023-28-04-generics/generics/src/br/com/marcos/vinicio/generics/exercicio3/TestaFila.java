package br.com.marcos.vinicio.generics.exercicio3;

public class TestaFila {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<String>();
        fila.enfileirar("Marcos");
        fila.enfileirar("Vinicio");
        fila.enfileirar("Santos");
        fila.enfileirar("Silva");

        System.out.println("Tamanho da fila: " + fila.tamanho());
        System.out.println("Primeiro da fila: " + fila.desenfileirar());
        System.out.println("Tamanho da fila: " + fila.tamanho());
        System.out.println("Primeiro da fila: " + fila.desenfileirar());
        System.out.println("Tamanho da fila: " + fila.tamanho());
        System.out.println("Primeiro da fila: " + fila.desenfileirar());
        System.out.println("Tamanho da fila: " + fila.tamanho());
        System.out.println("Primeiro da fila: " + fila.desenfileirar());
        System.out.println("Tamanho da fila: " + fila.tamanho());
    }
}
