package br.edu.iftm;

public class Reitor extends EmpregadoDaFaculdade{

    public Reitor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String getInfo(){
        return super.getInfo() + "\n reitor";
    }
}
