package LaçosCondicionais;

import java.util.*;

public class Atv03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   /*ENTRADA:
    leia o código de um item
   (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro).

   SAIDA:
   A seguir, mostre na tela o valor total da conta e nome do produto que foi comprado.
    */

        String product;
        int price;
        int total;

        System.out.println("Código do Produto: ");
        int code = sc.nextInt();

        System.out.println("Quantidade: ");
        int quantity = sc.nextInt();


        switch (code) {

            case 01:
                product = "Cachorro-quente";
                price = 10;
                total = price * quantity;
                System.out.println("Produto: " + product);
                System.out.println("Valor total: " + total);
                break;

            case 02:
                product = "X-Salada";
                price = 15;
                total = price * quantity;
                System.out.println("Produto: " + product);
                System.out.println("Valor total: " + total);
                break;

            case 03:
                product = "X-Bacon";
                price = 18;
                total = price * quantity;
                System.out.println("Produto: " + product);
                System.out.println("Valor total: " + total);
                break;

            case 04:
                product = "Bauru";
                price = 12;
                total = price * quantity;
                System.out.println("Produto: " + product);
                System.out.println("Valor total: " + total);
                break;

            case 05:
                product = "Refrigerante";
                price = 8;
                total = price * quantity;
                System.out.println("Produto: " + product);
                System.out.println("Valor total: " + total);
                break;

            case 06:
                product = "Suco de laranja";
                price = 13;
                total = price * quantity;
                System.out.println("Produto: " + product);
                System.out.println("Valor total: " + total);
                break;

        }


        sc.close();
    }
}
