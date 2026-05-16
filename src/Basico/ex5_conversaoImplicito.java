package Basico;

import java.util.Scanner;

public class ex5_conversaoImplicito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInt = scanner.nextInt();

        double numeroDouble = numeroInt;

        System.out.println("Valor original: " + numeroInt);
        System.out.println("Valor convertido: " + numeroDouble);

    }
}
