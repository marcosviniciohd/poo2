package modelo;

public class Casa {
    private Pessoa proprietario;
    private Endereco endereco;

    public Casa(Pessoa proprietario, Endereco endereco) {
        this.proprietario = proprietario;
        this.endereco = endereco;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
