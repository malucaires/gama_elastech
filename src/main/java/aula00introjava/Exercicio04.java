/*
Exercício 4
Calcular a área de um triângulo (A = base * altura / 2)
*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int base, altura, area;

        System.out.println("Digite o valor da base do triângulo: ");
        base = teclado.nextInt();
        System.out.println("Digite o valor da altura do triângulo: ");
        altura = teclado.nextInt();
        area = base * altura / 2;

        System.out.println("A área do triângulo é " + area + ".");

        teclado.close();
    }
}