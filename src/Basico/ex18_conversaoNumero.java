package Basico;

import java.util.Scanner;

public class ex18_conversaoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String numeroTexto = scanner.nextLine();

        int numero = Integer.parseInt(numeroTexto);
        int dobro = numero * 2;

        System.out.println("Valor original: \"" + numeroTexto + "\"");
        System.out.println("Valor convertido: " + numero);
        System.out.println("O dobro do número é: " + dobro);

    }
}
