/*
Exercício 03
Calcular a área de um retângulo (A = base * altura)
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int base, altura, area;

        System.out.println("Digite o valor da base do retângulo: ");
        base = teclado.nextInt();
        System.out.println("Digite o valor da altura do retângulo: ");
        altura = teclado.nextInt();
        area = base * altura;

        System.out.println("A área do retângulo é: " + area + ".");

        teclado.close();
    }
}