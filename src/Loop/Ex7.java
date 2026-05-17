package Loop;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        System.out.println("Digite numeros (-1 para parar):");

        while (true) {
            System.out.print("Numero: ");
            int n = sc.nextInt();

            if (n == -1) break;

            soma += n;
            if (n > maior) maior = n;
            if (n < menor) menor = n;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
