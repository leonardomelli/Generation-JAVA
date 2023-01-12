//ATIVIDADE 02
package LaçosDeRepetição;

import java.util.*;

public class Repeticao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Entrada:
         leia 10 números inteiros via teclado (V)
         Metodo:
         quantos números são pares e quantos número são ímpares.(V)
         Saida:
         mostre na tela
         quantos números são pares e quantos número são ímpares. (V)
         */

        int impares = 0;
        int pares = 0;
        int num;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Digite o " + i + "º" + " número: ");
            num = sc.nextInt();
            if (num % 2 == 0) {

                pares ++;

            }
            else {

                impares ++;


            }


        }
        System.out.println("Total de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);

        sc.close();
    }
}
