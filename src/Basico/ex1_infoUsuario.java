package Basico;

import java.util.Scanner;

public class ex1_infoUsuario {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double altura;

        System.out.println("Informe seu nome completo");
        nome = scanner.nextLine();

        System.out.println("Informe sua idade");
        idade = scanner.nextInt();

        System.out.println("Informe sua altura");
        altura = scanner.nextDouble();

        scanner.nextLine();

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);


    }
}