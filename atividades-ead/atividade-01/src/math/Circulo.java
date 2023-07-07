package math;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo(int raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }

}
