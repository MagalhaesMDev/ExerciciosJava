package Loop;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        double a = sc.nextDouble();
        System.out.print("Operacao (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.print("Segundo numero: ");
        double b = sc.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Resultado: " + (a + b));
                break;
            case '-':
                System.out.println("Resultado: " + (a - b));
                break;
            case '*':
                System.out.println("Resultado: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Resultado: " + (a / b));
                } else {
                    System.out.println("Erro: divisao por zero");
                }
                break;
            default:
                System.out.println("Operacao invalida.");
        }

        sc.close();
    }
}
