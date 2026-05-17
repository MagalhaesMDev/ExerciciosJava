package Loop;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        int a = sc.nextInt();
        System.out.print("Segundo numero: ");
        int b = sc.nextInt();

        int maior = (a >= b) ? a : b;
        System.out.println("Maior: " + maior);

        sc.close();
    }
}
