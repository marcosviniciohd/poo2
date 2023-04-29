package br.com.marcos.vinicio.generics.exercicio2;

public class TestaConjutoDeElementos {
    public static void main(String[] args) {
        Conjunto<String> conjunto = new Conjunto<>();
        conjunto.adicionar("Marcos");
        conjunto.adicionar("Vinicio");
        conjunto.adicionar("Fernandes");
        conjunto.adicionar("Daniela");
        conjunto.adicionar("Juliana");
        conjunto.adicionar("Junior");
        conjunto.remover("Juliana");
        conjunto.remover("Marcos");
        conjunto.getElementos().forEach(System.out::println);
        conjunto.adicionar("Marcos");
        conjunto.getElementos().forEach(System.out::println);
        conjunto.adicionar("Marcos");
        conjunto.getElementos().forEach(System.out::println);


    }
}
