package LaçosCondicionais;

import java.util.*;

public class Atv04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Entrada:
        leia a idade de uma pessoa (número inteiro)
        Saida:
        apresente na tela se a pessoa está ou não apta a votar e se seu voto é obrigatório ou
        facultativo, conforme a tabela abaixo:
         */

        int idade;

        System.out.println("Digite a idade: ");
        idade = sc.nextInt();

        if (idade >= 16 && idade < 18) {

            System.out.println("A pessoa está apta a votar e o voto é facultativo.");

        } else if (idade >= 18 && idade < 65) {

            System.out.println("A pessoa está apta a votar e o voto é obrigatório.");

        } else if (idade >= 65) {

            System.out.println("A pessoa está apta a votar e o voto é facultativo.");

        } else {
            System.out.println("A pessoa não está apta a votar.");
        }


        sc.close();
    }
}
