public class Diretor extends Funcionario{
    private int senha;
    @Override
    public double getBonificacao(){
        return super.getSalario() * 0.2;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
