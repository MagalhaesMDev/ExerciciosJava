package Basico;

import java.util.Scanner;

public class ex20_logicaComposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número : ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        boolean resultado = (num1 > num2) && (num3 != num2);


        System.out.println("Primeiro número: " + num1);
        System.out.println("Segundo número: " + num2);
        System.out.println("Terceiro número: " + num3);
        System.out.println("Resultado  (num1 > num2 && num3 != num2): " + resultado);

    }
}