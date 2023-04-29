package br.com.marcos.vinicio.generics.exercicio4;

import java.util.Map;

public class Mapa<T, V> {
    private Map<T, V> mapa;

    public Mapa() {
        this.mapa = mapa;
    }

    public void adiciona(T chave, V valor) {
        this.mapa.put(chave, valor);
    }

    public void remover(T chave) {
        this.mapa.remove(chave);
    }

    public V obter(T chave) {
        return this.mapa.get(chave);
    }
}
