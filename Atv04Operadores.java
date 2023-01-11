package Operações;

import java.util.Scanner;

public class Atv04Operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n1,n2,n3,n4,df;

        System.out.println("Informe número 01: ");
        n1 = sc.nextFloat();

        System.out.println("Informe número 02: ");
        n2 = sc.nextFloat();

        System.out.println("Informe número 03: ");
        n3 = sc.nextFloat();

        System.out.println("Informe número 04: ");
        n4= sc.nextFloat();

        df = (n1 * n2) - (n3 * n4);

        System.out.println("Diferença: " + df);


        sc.close();


    }
}
