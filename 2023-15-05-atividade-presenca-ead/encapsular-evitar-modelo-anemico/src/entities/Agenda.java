package entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private Contato contato;
    private List<Contato> contatos = new ArrayList<>();

    public Agenda() {
    }

    public Agenda(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    public Contato buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    public Contato atualizaContato(Contato contato) {
        for (Contato contatoLista : contatos) {
            if (contatoLista.getId() == contato.getId()) {
                contatoLista.setNome(contato.getNome());
                contatoLista.setTelefone(contato.getTelefone());
                contatoLista.setEmail(contato.getEmail());
                return contatoLista;
            }
        }
        return null;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public Contato getContato() {
        return contato;
    }

}
