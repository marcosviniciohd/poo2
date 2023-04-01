package br.edu.iftm.estudante.pkg03;

public class Caminhao extends Veiculo {
    public Caminhao(int velocidade) {
        super(velocidade);
    }

    @Override
    public void acelerar() {
        this.setVelocidade(this.getVelocidade() + 30);
    }
}
