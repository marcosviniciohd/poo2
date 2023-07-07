package modelo;

public class Retangulo {
    private Integer base;
    private Integer altura;

    public Retangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public Integer calcularArea() {
        return this.base * this.altura;
    }

    public Integer calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }

    // Método que verifica se o retângulo é quadrado
    public boolean isQuadrado() {
        if (this.base == this.altura) {
            System.out.println("O retângulo é um quadrado.");
            return true;
        } else {
            System.out.println("O retângulo não é um quadrado.");
            return false;
        }
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        if (base > 0) {
            this.base = base;
        }
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }
}
