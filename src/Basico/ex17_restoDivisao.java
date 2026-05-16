package Basico;

import java.util.Scanner;

public class ex17_restoDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int divisaoInteira = num1 / num2;
        int resto = num1 % num2;

        System.out.println(num1 + " / " + num2 + " = " + divisaoInteira + " (quociente)");
        System.out.println(num1 + " % " + num2 + " = " + resto + " (resto)");

    }
}
