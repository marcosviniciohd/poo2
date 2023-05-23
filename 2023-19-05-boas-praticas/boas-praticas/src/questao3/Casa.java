package questao3;

import questao2.Produto;

import java.util.ArrayList;

public class Casa {
    private String nome;
    private String descricao;
    private int posicao;
    private ArrayList<Peca> pecas = new ArrayList<Peca>();

    public Casa() {
    }

    public Casa(String nome, String descricao, int posicao) {
        this.nome = nome;
        this.descricao = descricao;
        this.posicao = posicao;
    }

    public void adicionarPeca(Peca peca){
        pecas.add(peca);
    }

    public void removerPeca(Peca peca){
        pecas.remove(peca);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public ArrayList<Peca> getPecas() {
        return pecas;
    }

    public void setPecas(ArrayList<Peca> pecas) {
        this.pecas = pecas;
    }
}
