package br.edu.iftm.atividade10;

import java.util.List;

public class Fazenda {
    public void alimentarAnimais(List<Animal> list){
        for(int i = 0; i < list.size(); i ++){
            list.get(i).comer();
        }
    }
}
