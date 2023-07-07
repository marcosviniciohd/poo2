package modelo;

public class ContaCorrente {
    private String nome;
    private String senha;
    private Double saldo;

    public ContaCorrente(String nome, String senha, Double saldo) {
        this.nome = nome;
        this.senha = senha;
        this.saldo = saldo;
    }

    public void cadastrarSenha(String senha) {
        this.senha = senha;
    }

    public void alterarSenha(String senhaAntiga, String senhaNova) {
        if (senhaAntiga.equals(this.senha)) {
            this.senha = senhaNova;
        }
    }

    public void credito (Double valor, String senha) {
        if (senha.equals(this.senha)) {
            this.saldo += valor;
        } else {
            System.out.println("Senha incorreta!");
        }
    }

    public void debito (Double valor, String senha) {
        if (senha.equals(this.senha)) {
            this.saldo -= valor;
        } else {
            System.out.println("Senha incorreta!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Double getSaldo() {
        return saldo;
    }
}
