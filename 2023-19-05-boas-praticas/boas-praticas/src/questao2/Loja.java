package questao2;

public class Loja {
    private String nome;
    private String cnpj;
    private Produto produto = new Produto();

    public Loja() {
    }
    public Loja(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void venderProduto(Produto produto){
        System.out.println("Vendendo " + produto.getNome());
    }

    public void comprarProduto(Produto produto){
        System.out.println("Comprando " + produto.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
