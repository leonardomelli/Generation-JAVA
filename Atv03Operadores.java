package Operações;

import java.util.Scanner;

public class Atv03Operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salarioBruto,adcNoturno,hrEx,descontos,salarioLiquido;

        System.out.println("Salário Bruto: ");
        salarioBruto = sc.nextFloat();

        System.out.println("Adicional Noturno: ");
        adcNoturno = sc.nextFloat();

        System.out.println("Horas Extras: ");
        hrEx = sc.nextFloat();

        System.out.println("Descontos: ");
        descontos = sc.nextFloat();

        salarioLiquido = salarioBruto + adcNoturno + (hrEx * 5) - descontos;

        System.out.println("Salário Líquido: " + salarioLiquido);


        sc.close();
    }
}
