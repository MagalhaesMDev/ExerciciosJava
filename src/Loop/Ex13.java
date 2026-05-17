package Loop;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota (0-100): ");
        int nota = sc.nextInt();

        char conceito;
        if (nota >= 90) {
            conceito = 'A';
        } else if (nota >= 80) {
            conceito = 'B';
        } else if (nota >= 70) {
            conceito = 'C';
        } else if (nota >= 60) {
            conceito = 'D';
        } else {
            conceito = 'F';
        }

        System.out.println("Conceito: " + conceito);

        sc.close();
    }
}
