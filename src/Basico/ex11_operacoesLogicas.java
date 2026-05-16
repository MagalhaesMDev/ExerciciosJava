package Basico;

import java.util.Scanner;

public class ex11_operacoesLogicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor booleano: ");
        boolean valor1 = scanner.nextBoolean();

        System.out.print("Digite o segundo valor booleano: ");
        boolean valor2 = scanner.nextBoolean();

        boolean and = valor1 && valor2;
        boolean or = valor1 || valor2;
        boolean not1 = !valor1;
        boolean not2 = !valor2;

        System.out.println(valor1 + " AND " + valor2 + " = " + and);
        System.out.println(valor1 + " OR " + valor2 + " = " + or);
        System.out.println("NOT " + valor1 + " = " + not1);
        System.out.println("NOT " + valor2 + " = " + not2);

    }
}
