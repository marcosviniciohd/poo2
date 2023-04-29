package br.com.marcos.vinicio.generics.exercicio4;

public class TestaMapa {
    public static void main(String[] args) {
        Mapa<String, String> mapa = new Mapa<String, String>();
        mapa.adiciona("Marcos", "Vinicio");
        mapa.adiciona("Santos", "Silva");
        mapa.adiciona("João", "Oliveira");
        mapa.remover("João");
        mapa.remover("Santos");
        System.out.println("Marcos: " + mapa.obter("Marcos"));
        System.out.println("Santos: " + mapa.obter("Santos"));
    }
}
