package vetor;

import java.util.Scanner;

public class ex2_ParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[15];

        System.out.println("Digite 15 números:");
        for (int i = 0;i < 15;i++) {
            System.out.print("Número " + (i + 1));
            numeros[i] = sc.nextInt();
        }

        String pares = "";
        String impares = "";
        int contadorpares = 0;
        int contadorimpares = 0;

        for (int i = 0;i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares += numeros[i] + " ";
                contadorpares++;
            }
            else {
                impares += numeros[i] + " ";
                contadorimpares++;
            }

        }

        System.out.print("Vetor original: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Mostrar pares
        System.out.println("\nNúmeros pares: " + pares);
        System.out.println("Quantidade de pares: " + contadorpares);

        // Mostrar ímpares
        System.out.println("\nNúmeros ímpares: " + impares);
        System.out.println("Quantidade de ímpares: " + contadorimpares);

    }
}
