//ATIVIDADE 04

package LaçosDeRepetição;

import java.util.*;

public class Repeticao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Entrada:
        leia via teclado as seguintes informações de cada colaborador:
Idade (Número inteiro) (V)
Sexo (Número Inteiro):(V)
1 – Masculino
2 – Feminino
3 – Outros
Categoria (Número Inteiro): (V)
1 – Backend
2 – Frontend
3 – Mobile
4 – FullStack

EXEMPLO
Digite a Idade: 21
Digite o Sexo: 2
Digite a Categoria: 1

Deseja continuar (S/N): S


Saida da estrutura while: (V)
 perguntar ao usuário se ele deseja continuar a
 leitura dos dados de um novo colaboradore ou não (S/N).


 SAIDA: (V)
Total de pessoas desenvolvedoras Backend: 2

Total de mulheres desenvolvedoras Frontend: 1

Total de homens desenvolvedores Mobile maiores de 40 anos: 1

Total de mulheres desenvolvedoras FullStack menores de 30 anos: 1

         */

        String saida = "S";
        int backend = 0;
        int frontend = 0, mobile = 0, fullstack = 0;

        while (saida.equals("S")) {

            System.out.println("Digite a Idade: ");
            int idade = sc.nextInt();

            System.out.println("Digite o Sexo: ");
            int sexo = sc.nextInt();
            String tipoSexo = null;

            System.out.println("Digite a Categoria: ");
            int categoria = sc.nextInt();
            String tipoCategoria = null;

            switch (sexo) {

                case 1:
                    tipoSexo = ("Masculino");
                    break;
                case 2:
                    tipoSexo = ("Feminino");
                    break;

                case 3:
                    tipoSexo = ("Outros");
                    break;
            }

            switch (categoria) {

                case 1:
                    tipoCategoria = ("Backend");
                    backend++;
                    break;
                case 2:
                    tipoCategoria = ("Frontend");
                    break;

                case 3:
                    tipoCategoria = ("Mobile");
                    break;
                case 4:
                    tipoCategoria = ("FullStack");
                    break;

            }

            if (tipoSexo.equals("Feminino") && tipoCategoria.equals("Frontend")) {

                frontend++;

            } else if (tipoSexo.equals("Masculino") && idade > 40 && tipoCategoria.equals("Mobile")) {

                mobile++;

            } else if (tipoSexo.equals("Feminino") && idade < 30 && tipoCategoria.equals("FullStack")) {

                fullstack++;

            }

            System.out.println("Deseja continuar (S/N): ");
            saida = sc.next();
        }

        System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
        System.out.println("Total de mulheres desenvolvedoras Frontend: " + frontend);
        System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + mobile);
        System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + fullstack);


        sc.close();
    }
}
