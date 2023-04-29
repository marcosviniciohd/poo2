package br.com.marcos.vinicio.generics.exercicio3;

import java.util.ArrayList;

public class Fila<T> {
    private ArrayList<T> fila = new ArrayList<T>();

    public void enfileirar(T elemento) {
        fila.add(elemento);
    }

    public T desenfileirar() {
        return fila.remove(0);
    }

    public int tamanho() {
        return fila.size();
    }
}
