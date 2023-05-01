package logic_test;

import java.util.Scanner;

public class Exe2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        boolean pertence = false;
        int a = 0, b = 1, c = 0;
        
        while (c < num) {
            c = a + b;
            a = b;
            b = c;
        }
        
        if (c == num) {
            pertence = true;
        }
        
        if (pertence) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
        
        sc.close();
    }
}
