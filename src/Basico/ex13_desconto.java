package Basico;

import java.util.Scanner;

public class ex13_desconto{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        double percentualDesconto = scanner.nextDouble();

        double valorDesconto = valorProduto * (percentualDesconto / 100);
        double valorFinal = valorProduto - valorDesconto;

        System.out.println("Valor original: R$ " + valorProduto);
        System.out.println("Percentual de desconto: " + percentualDesconto + "%");
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final: R$ " + valorFinal);

    }
}