public class Gerente extends Funcionario{
    private int senha;
    private int nivel;

    @Override
    public double getBonificacao(){
        return super.getSalario() * 0.15;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
