package br.edu.iftm.sistema.biblioteca.principal;

import br.edu.iftm.sistema.biblioteca.model.DVD;
import br.edu.iftm.sistema.biblioteca.model.Livro;
import br.edu.iftm.sistema.biblioteca.model.Revista;
import br.edu.iftm.sistema.biblioteca.model.Usuario;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Marcos Vinício", "marcos@gmail.com", "123");
        Usuario usuario2 = new Usuario("Antonio Silva", "antonio@gmail.com", "456");
        Usuario usuario3 = new Usuario("Daniela", "daniela@gmail.com", "789");

        Livro livro1 = new Livro("Harry potter", "J. K. Rowling", true, new Date(), 200, "Bloomsbury");
        Revista revista1 = new Revista("Superinteressante", "Superinteressante", true, 448, "Grupo Abril");
        DVD dvd1 = new DVD("Interestelar", "Christopher Nolan", true, "Ficção científica", 2 * 60);

        Livro livro2 = new Livro("O poder do hábito", "Charles Duhigg", true, new Date(), 515, "Objetiva");
        Revista revista2 = new Revista("Veja", "Veja", true, 2833, "Grupo Abril");
        DVD dvd2 = new DVD("O Poderoso Chefão", "Francis Ford Coppola", true, "Drama", 2 * 60);

        Livro livro3 = new Livro("De sangue e cinzas", "De sangue e cinzas", true, new Date(), 679, "Galera");
        Revista revista3 = new Revista("Quatro Rodas", "Quatro Rodas", true, 767, "Grupo Abril");
        DVD dvd3 = new DVD("À Espera de um Milagre", "Frank Darabont", true, "Fantasia", 3 * 60);

        usuario1.emprestar(livro1);
        System.out.println(usuario1);

        usuario1.emprestar(revista1);
        System.out.println(usuario1);

        usuario1.emprestar(dvd1);
        System.out.println(usuario1);

        usuario1.devolver(livro1);
        System.out.println(usuario1);

        usuario1.devolver(revista1);
        System.out.println(usuario1);

        System.out.println();

        usuario2.emprestar(livro2);
        System.out.println(usuario2);

        usuario2.emprestar(revista2);
        System.out.println(usuario2);

        usuario2.emprestar(dvd2);
        System.out.println(usuario2);

        usuario2.devolver(revista2);
        System.out.println(usuario2);

        usuario2.devolver(dvd2);
        System.out.println(usuario2);

        System.out.println("-------------------------------------------------------------------------");

        usuario3.emprestar(livro3);
        System.out.println(usuario3);

        usuario3.emprestar(revista3);
        System.out.println(usuario3);

        usuario3.emprestar(dvd3);
        System.out.println(usuario3);

        usuario3.devolver(livro3);
        System.out.println(usuario3);

        usuario3.devolver(dvd3);
        System.out.println(usuario3);
    }
}
