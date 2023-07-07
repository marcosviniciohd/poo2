package br.edu.iftm.marcos.vinicio.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Emprestimo {
    private final List<Item> items = new ArrayList<>();
    private Usuario usuario;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(Usuario usuario) {
        this.usuario = usuario;
    }

    public void emprestimo() {
        dataEmprestimo = new Date();
        items.addAll(usuario.getCarrinho());
        usuario.limpar();
    }

    public void devolver() {
        dataDevolucao = new Date();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "usuario=" + usuario + ", items=" + items + ", dataEmprestimo=" + dataEmprestimo + ", dataDevolucao=" + dataDevolucao + '}';
    }
}
