/*
Escreva um programa que leia um inteiro N (1 < N < 1000).
Este N é o número de linhas de saída impressas por este programa.
 */

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Digite um número entre 1 e 1000:");
            numero = s.nextInt();
        } while (numero < 0 || numero > 1000);

        System.out.println(numero);

        for (int i = 1; i <= numero; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
        }

        s.close();
    }
}