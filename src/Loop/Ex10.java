package Loop;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero inicial: ");
        int ini = sc.nextInt();
        System.out.print("Numero final: ");
        int fim = sc.nextInt();

        int somaPares = 0;
        int somaImpares = 0;

        for (int i = ini; i <= fim; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            } else {
                somaImpares += i;
            }
        }

        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos impares: " + somaImpares);

        sc.close();
    }
}
