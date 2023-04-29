package br.com.marcos.vinicio.generics.exercicio5;

public class TestaConjuntoOrdnado {
    public static void main(String[] args) {
        ConjuntoOrdenado<String> chamada = new ConjuntoOrdenado();
        chamada.adicionar("Lucas Ilussencio");
        chamada.adicionar("Ana Maria");
        chamada.adicionar("Bruna Maria");
        System.out.println(chamada);
        chamada.remover("Ana Maria");
        System.out.println(chamada);
        System.out.println("Aluno 01: "+chamada.obter(0));
        System.out.println("Aluno 02: "+chamada.obter(1));
    }
}
