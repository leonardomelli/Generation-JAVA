package LaçosCondicionais;

import java.util.*;

public class Atv02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        ENTRADA:
        leia um número inteiro via teclado
        METODO:
        indicando se este número é par ou ímpar e se o número
        é positivo ou negativo.
        SAIDA:
        emostre na tela uma mensagem indicando se este número é par ou ímpar e se o número
        é positivo ou negativo.
         */


        int num;

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        if (num > 0 && num % 2 == 0) {

            System.out.println("O Número " + num + " é par e positivo!");

        } else if (num < 0 && num % 2 == 0) {

            System.out.println("O Número " + num + " é par e negativo!");

        } else if (num > 0 && num % 2 != 0) {

            System.out.println("O Número " + num + " é impar e positivo!");

        } else if (num < 0 && num % 2 != 0) {

            System.out.println("O Número " + num + " é impar e negativo!");

        }

        sc.close();
    }
}
