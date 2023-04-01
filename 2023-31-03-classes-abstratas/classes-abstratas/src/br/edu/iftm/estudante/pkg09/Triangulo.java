package br.edu.iftm.estudante.pkg09;

public class Triangulo extends Forma{
    public Triangulo(double l) {
        super(l);
    }

    @Override
    public double calcularArea() {
        return super.getL() * super.getL() * super.getL();
    }
}
