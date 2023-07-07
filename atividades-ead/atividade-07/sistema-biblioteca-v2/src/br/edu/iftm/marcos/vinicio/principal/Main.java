package br.edu.iftm.marcos.vinicio.principal;

import br.edu.iftm.marcos.vinicio.model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Marcos Vinício", "marcos@gmail.com", "123");
        Usuario usuario2 = new Usuario("Daniela", "daniela@gmail.com", "456");
        Usuario usuario3 = new Usuario("Antonio", "antonio@gmail.com", "789");

        Livro livro1 = new Livro("Harry potter", "J. K. Rowling", true, new Date(), 200, "Bloomsbury");
        Revista revista1 = new Revista("Superinteressante", "Superinteressante", true, 448, "Grupo Abril");
        DVD dvd1 = new DVD("Interestelar", "Christopher Nolan", true, "Ficção científica", 2 * 60);

        Livro livro2 = new Livro("O poder do hábito", "Charles Duhigg", true, new Date(), 515, "Objetiva");
        Revista revista2 = new Revista("Veja", "Veja", true, 2833, "Grupo Abril");
        DVD dvd2 = new DVD("O Poderoso Chefão", "Francis Ford Coppola", true, "Drama", 2 * 60);

        Livro livro3 = new Livro("De sangue e cinzas", "De sangue e cinzas", true, new Date(), 679, "Galera");
        Revista revista3 = new Revista("Quatro Rodas", "Quatro Rodas", true, 767, "Grupo Abril");

        usuario1.escolher(livro1);
        usuario1.escolher(revista1);
        usuario1.escolher(dvd1);
        Emprestimo emprestimo1 = new Emprestimo(usuario1);
        emprestimo1.emprestimo();

        usuario2.escolher(livro2);
        usuario2.escolher(revista2);
        usuario2.escolher(dvd2);
        usuario2.devolver(livro2);
        Emprestimo emprestimo2 = new Emprestimo(usuario2);
        emprestimo2.emprestimo();

        usuario3.escolher(livro3);
        usuario3.escolher(revista3);
        Emprestimo emprestimo3 = new Emprestimo(usuario3);
        emprestimo3.emprestimo();
        emprestimo3.devolver();

        System.out.println(emprestimo1);
        System.out.println(emprestimo2);
        System.out.println(emprestimo3);
    }
}
