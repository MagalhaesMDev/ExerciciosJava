import java.util.Scanner;

public class ex10_comparacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        boolean igual = num1 == num2;
        boolean diferente = num1 != num2;
        boolean maior = num1 > num2;
        boolean menor = num1 < num2;
        boolean maiorOuIgual = num1 >= num2;
        boolean menorOuIgual = num1 <= num2;

        System.out.println(num1 + " == " + num2 + "? " + igual);
        System.out.println(num1 + " != " + num2 + "? " + diferente);
        System.out.println(num1 + " > " + num2 + "? " + maior);
        System.out.println(num1 + " < " + num2 + "? " + menor);
        System.out.println(num1 + " >= " + num2 + "? " + maiorOuIgual);
        System.out.println(num1 + " <= " + num2 + "? " + menorOuIgual);

    }
}
