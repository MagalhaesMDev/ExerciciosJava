
/*2. Elabore um programa que leia dois números inteiros digitados pelo usuário por meio do
teclado. Armazene esses valores em variáveis do tipo int, realize a soma utilizando o operador
matemático adequado e armazene o resultado em uma terceira variável. Ao final, apresente
na tela uma mensagem explicativa contendo os valores informados e o resultado obtido.
 */


import java.util.Scanner;


public class ex2_soma {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n1;
        int n2;
        int soma;

        System.out.println("Informe o primeiro numero:");
        n1 = scanner.nextInt();

        System.out.println("Informe o segundo numero:");
        n2 = scanner.nextInt();

        soma = n1 + n2;

        System.out.println("Resultado " + soma);


    }
}
