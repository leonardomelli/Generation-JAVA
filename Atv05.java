package LaçosCondicionais;

import java.util.*;

public class Atv05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


    /*Entrada:
    leia um valor com duas casas decimais, equivalente ao salário
     de uma pessoa.
     Metodo:
     calcule e mostre o valor que esta pessoa deve pagar de Imposto de
     Renda ou Isento, segundo a tabela abaixo:
     */

        System.out.println("Digite o Salário: R$ ");
        double salario = sc.nextDouble();
        double imposto;

        if (salario >= 2000.00 && salario < 3000.00) {
            imposto = (8.0/ 100) * salario;
            System.out.println("Imposto de Renda: R$ " + imposto);
        } else if (salario >= 3000.00 && salario < 4500.00) {
            imposto = (18.0 / 100) * salario;
            System.out.println("Imposto de Renda: R$ " + imposto);
        } else if (salario > 4500.00) {
            imposto = (28.0 / 100) * salario;
            System.out.println("Imposto de Renda: R$ " + imposto);

        } else {

            System.out.println("Isento");

        }


        sc.close();
    }
}
