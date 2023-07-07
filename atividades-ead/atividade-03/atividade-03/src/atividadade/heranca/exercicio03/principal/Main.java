package atividadade.heranca.exercicio03.principal;

import atividadade.heranca.exercicio03.modelo.Funcionario;
import atividadade.heranca.exercicio03.modelo.Pessoa;
import atividadade.heranca.exercicio03.modelo.Professor;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", "Medeiros");
        Funcionario pessoa2 = new Funcionario("Leonardo", "Messias", "100", 1000.00);
        Professor pessoa3 = new Professor("Antônio", "Silva", "200", 1500.00);
        System.out.println(pessoa1.getNomeCompleto());
        System.out.println(pessoa2.getNomeCompleto());
        System.out.println(pessoa3.getNomeCompleto());
        System.out.println(pessoa2.getSalarioPrimeiraParcela());
        System.out.println(pessoa2.getSalarioSegundaParcela());
        System.out.println(pessoa3.getSalarioPrimeiraParcela());
        System.out.println(pessoa3.getSalarioSegundaParcela());
    }
}
