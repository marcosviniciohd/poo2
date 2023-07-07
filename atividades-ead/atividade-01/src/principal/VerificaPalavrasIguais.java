package principal;

import java.util.Locale;
import java.util.Scanner;

public class VerificaPalavrasIguais {
    public static void main(String[] args) {
        // 5. (String) Escreva um programa Java para verificar se duas palavras são iguais.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = sc.nextLine();
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = sc.nextLine();
        if (palavra1.equals(palavra2)) {
            System.out.println("As palavras são iguais.");
        } else {
            System.out.println("As palavras são diferentes.");
        }

    }
}
