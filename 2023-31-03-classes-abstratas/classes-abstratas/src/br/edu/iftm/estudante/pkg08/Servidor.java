package br.edu.iftm.estudante.pkg08;

public class Servidor extends Computador{
    public Servidor(boolean status) {
        super(status);
    }

    @Override
    public void iniciar() {
        super.setStatus(true);
        System.out.println("Ligando Servidor");
    }
}
