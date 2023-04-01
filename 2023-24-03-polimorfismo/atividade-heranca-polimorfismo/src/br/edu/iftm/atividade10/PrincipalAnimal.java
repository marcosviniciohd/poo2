package br.edu.iftm.atividade10;

import java.util.ArrayList;
import java.util.List;

public class PrincipalAnimal {
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro();
        Galinha galinha = new Galinha();
        Gato gato =  new Gato();
        Vaca vaca = new Vaca();

        List<Animal> list = new ArrayList<>();
        list.add(cachorro);
        list.add(galinha);
        list.add(gato);
        list.add(vaca);

        Fazenda fazenda = new Fazenda();
        fazenda.alimentarAnimais(list);
    }
}
