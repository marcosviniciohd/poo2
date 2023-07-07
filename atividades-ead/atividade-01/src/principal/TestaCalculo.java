package principal;

import modelo.Calculo;

public class TestaCalculo {
    public static void main(String[] args) {
        Calculo calculo = new Calculo(1000);
        calculo.credito(500);
        System.out.println("Saldo: " + calculo.getSaldo());
        calculo.debito(200);
        System.out.println("Saldo: " + calculo.getSaldo());

    }
}
