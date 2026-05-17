package Loop;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secreto = (int) (Math.random() * 100) + 1;
        int chute;

        System.out.println("Adivinhe o numero entre 1 e 100");

        do {
            System.out.print("Seu chute: ");
            chute = sc.nextInt();

            if (chute < secreto) {
                System.out.println("Muito baixo!");
            } else if (chute > secreto) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Acertou!");
            }
        } while (chute != secreto);

        sc.close();
    }
}
