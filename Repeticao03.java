//ATIVIDADE 03
package LaçosDeRepetição;
import java.util.*;
public class Repeticao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Entrada: (V)
         leia a idade de várias pessoas (números inteiros)

         EXEMPLO: Digite uma idade:

         SAIDA: (V)
         mostre na tela o total de pessoas cuja idade seja menor que 21 anos e
         o total de pessoas cuja idade seja maior que 50 anos.
         EXEMPLO:
         Total de pessoas menores de 21 anos: 5

         Total de pessoas maiores de 50 anos: 3


          SAIDA DO WHILE (V)
          A leitura dos dados deve ser
          finalizada ao digitar uma idade negativa.

         */

        int idade = 0;
        int menor = 0;
        int maior = 0;

        while (idade >= 0) {

            System.out.println("Digite uma idade: ");
            idade = sc.nextInt();

            if (idade > 0 && idade < 21) {
                menor++;

            }

            else if (idade > 50) {

                maior++;

            }





        }

        System.out.println("Total de pessoas menores de 21 anos: " + menor);
        System.out.println("Total de pessoas maiores de 50 anos: " + maior);

    }
}
