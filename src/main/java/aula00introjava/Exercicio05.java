/*
Exercício 05
Calcular a área de um losango (A = diagonal1 * diagonal2)
 */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int area, diagonal1, diagonal2;

        System.out.println("Digite o valor da diagonal 1 do losango: ");
        diagonal1 = teclado.nextInt();
        System.out.println("Digite o valor da diagonal 2 do losango: ");
        diagonal2 = teclado.nextInt();
        area = diagonal1 * diagonal2;

        System.out.println("O valor da área do losango é: " + area + ".");

        teclado.close();
    }
}
