package br.edu.iftm.atividade8;

public class PrincipalComputador {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("Notebook", "Dell", "Inspiron 15 3000", "Preto", 3000.00);
        notebook.iniciar();
        System.out.println("=====================================");
        Desktop desktop = new Desktop("Desktop", "Dell", "Inspiron 15 3000", "Preto");
        desktop.iniciar();
        System.out.println("=====================================");
        Servidor servidor = new Servidor("Servidor", "Dell", "10.0.0.1", "SRV-01");
        servidor.iniciar();
    }
}
