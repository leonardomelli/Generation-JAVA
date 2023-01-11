package LaçosCondicionais;

import java.util.*;

public class Atv06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Entrada:
         leia 3 palavras (String), que definem as características
         de um tipo de animal possível segundo o diagrama abaixo, que deve ser lido da esquerda
         para a direita.
         SAIDA:
         Em seguida, mostre na tela qual dos animais foi escolhido, através das três palavras fornecidas:.
         */
        System.out.println("INFORME OS VALORES ABAIXO COM LETRA MINUSCOLA: ");
        System.out.println("Tipo do animal: ");
        String tipo = sc.next();
        System.out.println("Especie do animal: ");
        String especie = sc.next();
        System.out.println("Dieta do animal: ");
        String dieta = sc.next();

        if (tipo.equals("vertebrado") && especie.equals("ave") && dieta.equals("carnivoro")) {

            System.out.println("Águia");

        } else if (tipo.equals("vertebrado") && especie.equals("ave") && dieta.equals("onivoro")) {

            System.out.println("Pomba");

        } else if (tipo.equals("vertebrado") && especie.equals("mamifero") && dieta.equals("onivoro")) {

            System.out.println("Homem");

        } else if (tipo.equals("vertebrado") && especie.equals("mamifero" ) && dieta.equals("herbivoro")) {

            System.out.println("Vaca");

        } else if (tipo.equals("invertebrado") && especie.equals("inseto") && dieta.equals("hematofago")) {

            System.out.println("Pulga");

        } else if (tipo.equals("invertebrado") && especie.equals("inseto") && dieta.equals("herbivoro")) {

            System.out.println("Lagarta");

        } else if (tipo.equals("invertebrado") && especie.equals("anelideo") && dieta.equals("hematofago")) {

            System.out.println("Sanguessuga");

        } else if (tipo.equals("invertebrado")  && especie.equals("anelideo")  && dieta.equals("onivoro") ) {

            System.out.println("Minhoca");

        } else {

            System.out.println("Esse animal não existe!!! SERÁ UM POKÉMON????");

        }


        sc.close();
    }
}
