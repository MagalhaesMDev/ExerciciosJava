import java.util.Scanner;

public class ex12_comparacaoIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();

        boolean primeiraMaior = idade1 > idade2;
        boolean idadesIguais = idade1 == idade2;

        System.out.println("Primeira pessoa: " + idade1 + " anos");
        System.out.println("Segunda pessoa: " + idade2 + " anos");
        System.out.println("A primeira pessoa é mais velha? " + primeiraMaior);
        System.out.println("As idades são iguais? " + idadesIguais);

    }
}
