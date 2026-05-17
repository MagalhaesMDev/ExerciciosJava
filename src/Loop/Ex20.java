package Loop;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double n = sc.nextDouble();

        if (n >= 0) {
            System.out.printf("Raiz quadrada de %.2f = %.2f%n", n, Math.sqrt(n));
        } else {
            System.out.println("Nao e possivel calcular raiz de numero negativo.");
        }

        sc.close();
    }
}
