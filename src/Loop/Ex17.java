package Loop;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1-Pedra  2-Papel  3-Tesoura");
        System.out.print("Sua escolha: ");
        int jogador = sc.nextInt();

        int computador = (int) (Math.random() * 3) + 1;
        String[] opcoes = {"", "Pedra", "Papel", "Tesoura"};

        System.out.println("Voce: " + opcoes[jogador] + " | Computador: " + opcoes[computador]);

        if (jogador == computador) {
            System.out.println("Empate!");
        } else if ((jogador == 1 && computador == 3) ||
                   (jogador == 2 && computador == 1) ||
                   (jogador == 3 && computador == 2)) {
            System.out.println("Voce ganhou!");
        } else {
            System.out.println("Computador ganhou!");
        }

        sc.close();
    }
}
