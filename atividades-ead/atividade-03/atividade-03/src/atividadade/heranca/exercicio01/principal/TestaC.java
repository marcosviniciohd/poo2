package atividadade.heranca.exercicio01.principal;

import atividadade.heranca.exercicio01.modelo.C;

public class TestaC {
    public static void main(String[] args) {
        C c = new C();
        /*1. (herança, construtor em subclasses) Escreva duas classes, A e B, com construtores padrão (sem
        argumentos) que imprimem mensagens “classe A” e “classe B” respectivamente. Escreva outra classe
        chamada C que herda de A e possui um atributo do tipo B que é instanciado no momento da
        declaração. Não crie um construtor para C. Escreva um programa e no método main cria um objeto
        da classe C. Depois da execução desse programa o que será impresso. Explique os resultados.*/

        /*
        * Classe C herda de A, logo, ao instanciar um objeto da classe C, o construtor da classe A é chamado.
        * O construtor da classe A imprime "Classe A" e o construtor da classe C instancia um objeto da classe B,
        * que imprime "Classe B".
        * */

    }
}
