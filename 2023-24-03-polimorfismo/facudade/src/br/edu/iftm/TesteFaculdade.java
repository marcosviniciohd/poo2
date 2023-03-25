package br.edu.iftm;

public class TesteFaculdade {
    public static void main(String[] args) {
        EmpregadoDaFaculdade f1 = new EmpregadoDaFaculdade("João", 1000);
        ProfessorDaFaculdade f2 = new ProfessorDaFaculdade("Antonio", 1500, 10);

        GeradorDeRelatorio relatorio = new GeradorDeRelatorio();
        relatorio.adicionar(f1);
        relatorio.adicionar(f2);
    }
}
