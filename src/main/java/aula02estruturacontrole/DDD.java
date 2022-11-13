package aula02estruturacontrole;/*
Leia um número inteiro que é o número de código para discagem telefônica.
Em seguida, imprima o destino de acordo com a tabela a seguir:
61 - Brasília
71 - Salvador
11 - São Paulo
21 - Rio de Janeiro
32 - Juiz de Fora
19 - Campinas
27 - Vitória
31 - Belo Horizonte
Se o número de entrada não for encontrado na tabela acima, a saída deve ser:
DDD não cadastrado
 */

import java.util.Scanner;

public class DDD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int ddd;
        String destino;

        System.out.println("Digite o número do DDD: ");
        ddd = s.nextInt();

        switch (ddd) {
            case 61:
                destino = "Brasilia";
                break;
            case 71:
                destino = "Salvador";
                break;
            case 11:
                destino = "São Paulo";
                break;
            case 21:
                destino = "Rio de Janeiro";
                break;
            case 32:
                destino = "Juiz de Fora";
                break;
            case 19:
                destino = "Campinas";
                break;
            case 27:
                destino = "Vitória";
                break;
            case 31:
                destino = "Belo Horizonte";
                break;
            default:
                destino = "DDD não cadastrado";
        }

        System.out.println(destino);

        s.close();
    }
}