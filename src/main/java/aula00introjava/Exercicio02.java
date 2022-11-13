/*
Exercício 2
Calcular a área de um quadrado (A = lado * lado)
*/

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int area, lado;

        System.out.println("Digite o lado do quadrado: ");
        lado = teclado.nextInt();
        area = lado * lado;
        System.out.printf("A área do quadrado é %d.", area);
        teclado.close();
    }
}
