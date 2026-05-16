package vetor;

import java.util.Scanner;


public class ex1_SomaMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int soma = 0;

        for (int i = 0; i < 10;i++) {
            System.out.print("Número " + (i + 1) );
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 10;i++) {
            System.out.println("Posiçao" + i +": " + numeros[i]);
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 0;i < 10;i++){
            soma += numeros[i];

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }

        double media = soma / 10.0;

        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

    }
}
