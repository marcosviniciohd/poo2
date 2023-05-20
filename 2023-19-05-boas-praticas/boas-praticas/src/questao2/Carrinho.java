package questao2;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private double total = 0;

    public Carrinho() {
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
        total += produto.getPreco();
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);
        total -= produto.getPreco();
    }

    public void listarProdutos(){
        for (Produto produto : produtos) {
            System.out.println(produto.getNome());
        }
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public double getTotal() {
        return total;
    }
}
