package br.edu.iftm.estudante.pkg07;

public class Retangulo extends Figura{
    private double d;

    public Retangulo(double l, double d) {
        super(l);
        this.d = d;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public double calcularArea() {
        return super.getL() * this.d;
    }
}
