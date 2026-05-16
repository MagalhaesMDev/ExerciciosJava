package Basico;

import java.util.Scanner;

public class ex8_imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + String.format("%.2f", imc));

    }
}
