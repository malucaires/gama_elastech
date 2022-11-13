/*
Escreva um programa para ler as coordenadas (X, Y) de um número indeterminado de pontos no sistema cartesiano.
Para cada ponto escreva o quadrante ao qual ele pertence.
O programa termina quando pelo menos uma das duas coordenadas é 0 (nesta situação sem escrever nenhuma mensagem).
 */

import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x, y;

        do {
            System.out.println("Digite o valor de X: ");
            x = s.nextInt();
            System.out.println("Digite o valor de Y: ");
            y = s.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("Primeiro Quadrante");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto Quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro Quadrante");
            } else {
                break;
            }
        } while (true);

        s.close();
    }
}