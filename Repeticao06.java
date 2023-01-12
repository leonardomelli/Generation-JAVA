//ATIVIDADE 06

package LaçosDeRepetição;
import java.util.Scanner;

public class Repeticao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Entrada:
        leia números inteiros via teclado.

        exemplo:
            Digite um número:

        Saida do laço:
        até que o número
        zero seja digitado.

         Saida:
        mostre na tela a média de todos os números digitados, que
         sejam múltiplos de 3. Veja o exemplo abaixo:

         exemplo:

         A média de todos os números múltiplos de 3 é: 7.5

         */

        int num,soma = 0,i = 0;
        double media;


        do{

            System.out.println("Digite um número: ");
            num = sc.nextInt();


            if(num % 3 == 0 && num != 0){

                soma = soma + num;
                i ++;

            }



        }while (num != 0);

        media = soma / i;

        System.out.println("A média de todos os números múltiplos de 3 é: " + media);

    }
}
