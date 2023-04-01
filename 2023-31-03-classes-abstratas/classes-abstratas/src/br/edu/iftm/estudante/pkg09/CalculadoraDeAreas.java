package br.edu.iftm.estudante.pkg09;

import java.util.List;

public class CalculadoraDeAreas {

    public CalculadoraDeAreas() {
    }

    public double somaAreas(List<Forma> list){
        double soma = 0;
        for(int i = 0; i < list.size(); i++){
            soma = soma + list.get(i).calcularArea();
        }
        return soma;
    }
}
