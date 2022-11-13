/*
Exercício 08
Calcular o volume de um cubo (V = lado * lado * lado)
*/

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int volume, lado;

        System.out.println("Digite o valor do lado do cubo: ");
        lado = teclado.nextInt();
        volume = lado * lado * lado;

        System.out.println("O volume do cubo é: " + volume + ".");

        teclado.close();
    }
}