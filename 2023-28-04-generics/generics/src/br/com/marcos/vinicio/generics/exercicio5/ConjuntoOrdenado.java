package br.com.marcos.vinicio.generics.exercicio5;

import java.util.ArrayList;
import java.util.Collections;

public class ConjuntoOrdenado <T extends Comparable<T>>{
    private ArrayList<T> list = new ArrayList<>();

    public ConjuntoOrdenado() {
    }

    public ArrayList<T> getList() {
        return list;
    }

    public void setList(ArrayList<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ConjuntoOrdenado{" +
                "list=" + list +
                '}';
    }

    public void adicionar(T elem){
        list.add(elem);
        Collections.sort(list);
    }

    public void remover(T elem){
        list.remove(elem);
    }
    public T obter(int i){
        return list.get(i);
    }
}

