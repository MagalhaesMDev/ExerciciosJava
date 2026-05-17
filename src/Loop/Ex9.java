package Loop;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra = "java";
        char[] acertos = new char[palavra.length()];

        for (int i = 0; i < acertos.length; i++) {
            acertos[i] = '_';
        }

        int tentativas = 6;
        boolean ganhou = false;

        while (tentativas > 0 && !ganhou) {
            for (char c : acertos) System.out.print(c + " ");
            System.out.println("\nTentativas restantes: " + tentativas);
            System.out.print("Digite uma letra: ");
            char letra = sc.next().charAt(0);

            boolean achou = false;
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra) {
                    acertos[i] = letra;
                    achou = true;
                }
            }

            if (!achou) {
                tentativas--;
                System.out.println("Letra errada!");
            }

            ganhou = true;
            for (char c : acertos) {
                if (c == '_') {
                    ganhou = false;
                    break;
                }
            }
        }

        if (ganhou) {
            System.out.println("Parabens! A palavra era: " + palavra);
        } else {
            System.out.println("Perdeu! A palavra era: " + palavra);
        }

        sc.close();
    }
}
