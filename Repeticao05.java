//ATIVIDADE 05

package LaçosDeRepetição;
import java.util.*;
public class Repeticao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Entrada: (V)
        leia números inteiros via teclado

        exemplo: Digite um número:

        Saida do laço: (V)
        até que o número
        zero seja digitado.

        Saida:
       mostre na tela a soma de todos os números digitados, que sejam
       positivos.

       A soma dos números positivos é:

         */

        int num, soma = 0;

        do {
            System.out.println("Digite um número: ");
            num = sc.nextInt();

            if (num > 0) {

                soma += num;

            }


        } while (num != 0);
        System.out.println("A soma dos números positivos é: " + soma);


        sc.close();
    }
}
