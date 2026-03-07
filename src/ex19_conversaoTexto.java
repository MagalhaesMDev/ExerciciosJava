import java.util.Scanner;

public class ex19_conversaoTexto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String numeroString = String.valueOf(numero);
        String mensagem = "O número informado foi: " + numeroString;

        System.out.println("Valor original: " + numero);
        System.out.println("Valor convertido: \"" + numeroString + "\"");
        System.out.println("Mensagem final: " + mensagem);

    }
}
