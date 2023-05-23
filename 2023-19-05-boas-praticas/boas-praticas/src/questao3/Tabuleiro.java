package questao3;

import java.util.ArrayList;

public class Tabuleiro {
    private String nome;
    private int tamanho;
    private ArrayList<Casa> casas = new ArrayList<Casa>();

    public Tabuleiro() {
    }

    public Tabuleiro(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public void adicionarCasa(Casa casa){
        casas.add(casa);
    }

    public void removerCasa(Casa casa){
        casas.remove(casa);
    }

    public void listarCasas(){
        for (Casa casa : casas) {
            System.out.println(casa.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public ArrayList<Casa> getCasas() {
        return casas;
    }

    public void setCasas(ArrayList<Casa> casas) {
        this.casas = casas;
    }
}
