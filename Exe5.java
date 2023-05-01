package logic_test;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe uma string do usuário
        System.out.print("Digite uma palavra ou frase: ");
        String palavra = scanner.nextLine();

        // Converte a string para um array de caracteres
        char[] caracteres = palavra.toCharArray();

        // Inverte o array de caracteres
        for (int i = 0, j = caracteres.length - 1; i < j; i++, j--) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }

        // Converte o array de caracteres de volta para uma string
        String palavraInvertida = new String(caracteres);

        // Exibe a string invertida na tela
        System.out.println("A palavra/frase invertida é: " + palavraInvertida);

        scanner.close();
    }
}

