package principal;

import java.util.Locale;
import java.util.Scanner;

public class VerificaString {
    public static void main(String[] args) {
        // 4. (String) Escreva um programa Java para ler uma palavra e exibi-la em caracteres maiúsculos.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        System.out.println(palavra.toUpperCase());
        sc.close();
    }
}
