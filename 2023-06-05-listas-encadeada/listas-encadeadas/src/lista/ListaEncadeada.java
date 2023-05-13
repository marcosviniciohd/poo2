package lista;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private int tamanho;
    public void adiciona(T elemento){
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
        this.tamanho++;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio=" + inicio +
                '}';
    }
}
