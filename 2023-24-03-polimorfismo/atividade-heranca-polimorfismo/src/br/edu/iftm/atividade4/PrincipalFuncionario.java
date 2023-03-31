package br.edu.iftm.atividade4;

public class PrincipalFuncionario {
    public static void main(String[] args) {
        Funcionario assistente = new Funcionario();
        assistente.setNome("João");
        assistente.setCpf("123.456.789-00");
        System.out.println("Nome: " + assistente.getNome());
        System.out.println("CPF: " + assistente.getCpf());
        System.out.println("Salário: " + assistente.calcularSalario(20, 160));

        System.out.println("===================================");

        Funcionario diretor = new Diretor();
        diretor.setNome("Maria");
        diretor.setCpf("987.654.321-00");
        System.out.println("Nome: " + diretor.getNome());
        System.out.println("CPF: " + diretor.getCpf());
        System.out.println("Salário: " + diretor.calcularSalario(50, 160));

        System.out.println("===================================");

        Funcionario gerente = new Gerente();
        gerente.setNome("José");
        gerente.setCpf("123.456.789-00");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("CPF: " + gerente.getCpf());
        System.out.println("Salário: " + gerente.calcularSalario(10, 160));
        System.out.println("===================================");

    }
}
