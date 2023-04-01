package br.edu.iftm.estudante.pkg01;

public class Funcionario extends Pessoa {
    private String funcao;

    public Funcionario(String nome, String funcao) {
        super(nome);
        this.funcao = funcao;
    }
    @Override
    public void apresentar(){
        System.out.println("Olá, meu nome é " + getNome() + " e trabalho como " + funcao);
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
