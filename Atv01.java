package LaçosCondicionais;

import java.util.*;

public class Atv01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         /*ENTRADA:
         leia 3 valores int A, B e C
         SAIDA:
         e imprima na tela se a soma
        de A + B é maior, menor ou igual a C.
         */

        System.out.println("Digite o número A: ");
        int a = sc.nextInt();
        System.out.println("Digite o número B: ");
        int b = sc.nextInt();
        System.out.println("Digite o número C: ");
        int c = sc.nextInt();

        int soma = a + b;

        if (soma > c) {
            System.out.println("A Soma de A + B é Maior do que C ");
        } else if (soma < c) {
            System.out.println("A Soma de A + B é Menor do que C ");
        } else {

            System.out.println("A Soma de A + B é Igual a C ");

        }


        sc.close();
    }
}

