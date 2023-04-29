package br.com.marcos.vinicio.generics.exercicio1;

public class PilhaLimitada<T> {
    private Object[] elementos;
    private int tamanho;

    public PilhaLimitada(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void empilhar(T elemento) {
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public T desempilhar() {
        this.tamanho--;
        return (T) this.elementos[this.tamanho];
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public T topo() {
        return (T) this.elementos[this.tamanho - 1];
    }

    public Object[] getElementos() {
        return elementos;
    }

    public void setElementos(Object[] elementos) {
        this.elementos = elementos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
