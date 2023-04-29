package br.com.marcos.vinicio.generics.exercicio2;

import java.util.ArrayList;

public class Conjunto<T> {
    private ArrayList<T> elementos;

    public Conjunto() {
        this.elementos = new ArrayList<>();
    }

    public void adicionar(T elemento) {
        if (!this.elementos.contains(elemento)) {
            this.elementos.add(elemento);
        }else{
            System.out.println("O elemento já existe no conjunto");
        }
    }

    public void remover(T elemento) {
        this.elementos.remove(elemento);
    }

    public ArrayList<T> getElementos() {
        return elementos;
    }

}
