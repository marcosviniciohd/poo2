package br.edu.iftm.pru.service;

import br.edu.iftm.pru.model.Produto;

import java.util.HashMap;

public class CarrinhoCompras {
    private HashMap<Produto, Integer> itens;

    public CarrinhoCompras() {
        this.itens = new HashMap<Produto, Integer>();
    }

    public void addItem(Produto produto, int quantidade) {
        if (this.itens.containsKey(produto)) {
            this.itens.put(produto, this.itens.get(produto) + quantidade);
        } else {
            this.itens.put(produto, quantidade);
        }
    }

    public void removeItem(Produto produto, int quantidade) {
        if (this.itens.containsKey(produto)) {
            this.itens.put(produto, this.itens.get(produto) - quantidade);
        }
    }

   public void calcularTotal() {
       double total = 0;
       for (Produto produto : this.itens.keySet()) {
           total += produto.getPreco() * this.itens.get(produto);
       }
       System.out.println("Total: " + total);
   }
}
