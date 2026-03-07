import java.util.Scanner;

public class ex6_conversaoExplicito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numeroDouble = scanner.nextDouble();

        int numeroInt = (int) numeroDouble;

        System.out.println("Valor original: " + numeroDouble);
        System.out.println("Valor convertido: " + numeroInt);

    }
}
