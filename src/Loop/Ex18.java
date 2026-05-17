package Loop;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        int soma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) soma += i;
        }

        if (soma == n) {
            System.out.println(n + " e um numero perfeito!");
        } else {
            System.out.println(n + " nao e um numero perfeito.");
        }

        sc.close();
    }
}
