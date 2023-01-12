//ATIVIDADE 01
package LaçosDeRepetição;

import java.util.Scanner;


public class Repeticao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Entrada (V)
        leia 2 números inteiros via teclado,

        Metodo: (V)
        onde o primeiro número
        deve ser menor que o segundo número. Caso contrário, deve ser exibida uma mensagem na tela
        informando que o intervalo é inválido e sair do programa.
        Dentro do intervalo informado,

         Saida: (V)
         mostre na tela todes os números que são múltiplos de 3 e 5.
        Veja os exemplos abaixo:
        */

        int num1, num2;

        System.out.println("Digite o primeiro número do intervalo: ");
        num1 = sc.nextInt();
        System.out.println("Digite o último número do intervalo: ");
        num2 = sc.nextInt();
        if (num1 > num2) {

            System.out.println("Intervalo inválido!");

        } else {

            for (int i = num1; i <= num2; i++) {

                if (i % 3 == 0) {

                    System.out.println(i + " é múltiplo de 5 e 3");



                }
            }
        }
    }
}
