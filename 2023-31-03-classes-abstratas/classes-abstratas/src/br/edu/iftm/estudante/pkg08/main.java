package br.edu.iftm.estudante.pkg08;

public class main {
    public static void main(String[] args){
        Desktop desktop = new Desktop(false);
        desktop.iniciar();

        Notebook notebook = new Notebook(false);
        notebook.iniciar();

        Servidor servidor = new Servidor(false);
        servidor.iniciar();
    }
}