package br.edu.iftm;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade{

    private int horasAula;

    public ProfessorDaFaculdade(String nome, double salario, int horasAula) {
        super(nome, salario);
        this.horasAula = horasAula;
    }

    @Override
    public double getGastos(){
        return getSalario()  + this.getHorasAula() * 10;
    }

    @Override
    public String getInfo(){
        return getInfo() + "\n Horas: " + this.getHorasAula();
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }
}
