package questao1;

import java.util.ArrayList;

public class Zoologico {
    private String nome;
    private ArrayList<Jaula> jaulas = new ArrayList<Jaula>();

    public Zoologico() {
    }
    public Zoologico(String nome, ArrayList<Jaula> jaulas) {
        this.nome = nome;
        this.jaulas = jaulas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Jaula> getJaulas() {
        return jaulas;
    }

}
