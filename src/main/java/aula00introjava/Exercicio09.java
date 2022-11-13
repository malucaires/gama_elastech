/*
Exercício 09
Calcular o volume de um cilindo (V = 3.14 * raio * raio * altura)
*/

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double volume, raio, altura;

        System.out.println("Digite o valor do raio: ");
        raio = teclado.nextDouble();
        System.out.println("Digite o valor da altura: ");
        altura = teclado.nextDouble();
        volume = 3.14 * raio * raio * altura;

        System.out.printf("O volume do cilindro é %.3f cm³.", volume);

        teclado.close();
    }
}