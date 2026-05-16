package Basico;

import java.util.Scanner;

public class ex14_conversaoMonetaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais: R$ ");
        double reais = scanner.nextDouble();

        System.out.print("Digite a cotação do dólar: US$ ");
        double cotacaoDolar = scanner.nextDouble();

        double dolares = reais / cotacaoDolar;

        System.out.println("Valor em reais: R$ " + reais);
        System.out.println("Cotação do dólar: US$ " + cotacaoDolar);
        System.out.println("Valor em dólares: US$ " + String.format("%.2f", dolares));

    }
}