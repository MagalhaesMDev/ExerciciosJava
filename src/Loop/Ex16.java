package Loop;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuario: ");
        String usuario = sc.next();
        System.out.print("Senha: ");
        String senha = sc.next();

        if (usuario.equals("matheus") && senha.equals("1234")) {
            System.out.println("Login realizado com sucesso");
        } else {
            System.out.println("Usuario ou senha invalidos.");
        }

        sc.close();
    }
}
