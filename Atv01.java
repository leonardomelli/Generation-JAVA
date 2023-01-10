package Operações;
import java.util.*;
public class Atv01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        float salarioAtualf, abonof, novoSalariof;

        System.out.println("Digite o salário:");
        salarioAtualf = sc.nextFloat();
        System.out.println("Digite o Abono:");
        abonof = sc.nextFloat();
        novoSalariof = salarioAtualf + abonof;
        System.out.println("Seu novo salário: " + novoSalariof);


        sc.close();

     }
    }
