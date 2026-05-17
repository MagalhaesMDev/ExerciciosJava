package Loop;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        boolean primo = (n > 1);
        int div = 2;

        while (div <= n / 2) {
            if (n % div == 0) {
                primo = false;
                break;
            }
            div++;
        }

        if (primo) {
            System.out.println(n + " e primo.");
        } else {
            System.out.println(n + " nao e primo.");
        }

        sc.close();
    }
}
