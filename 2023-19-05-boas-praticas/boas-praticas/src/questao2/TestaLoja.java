package questao2;

public class TestaLoja {
    public static void main(String[] args) {
        Loja loja = new Loja("Loja 1", "123456789");
        Produto produto = new Produto("Notebook", "Notebook Lenovo", 1000.0, 10);
        Produto produto1 = new Produto("Smartphone", "Smartphone Samsung", 2500.0, 15);
        Produto produto2 = new Produto("Smartwatche", "Smartwatche Xiaome", 1500.0, 20);
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(produto);
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.getProdutos().forEach(p -> System.out.println("Produto : " + p.getNome() + " - " + "Valor: "+ p.getPreco()));
        System.out.println("Valor total dos produtos no carrinho é " + carrinho.getTotal());
        
    }
}
