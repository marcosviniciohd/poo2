package program;

import entities.Agenda;
import entities.Contato;

public class TestaAgendaContato {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contato contato = new Contato("João", "123456789", "joao@gmail.com");
        agenda.adicionarContato(contato);
        System.out.println(agenda.getContatos());
        System.out.println(agenda.buscarContatoPorNome("João"));
        System.out.println(agenda.atualizaContato(new Contato(1, "João das Coves", "123456789", "joao@gmail")));
        System.out.println(agenda.getContatos());
    }
}
