/*
Exercício 6
Calcular a área do trapézio (A = (baseMaior + baseMenor) * altura / 2)
*/

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int baseMaior, baseMenor, altura, area;

        System.out.println("Digite o valor da base maior: ");
        baseMaior = teclado.nextInt();
        System.out.println("Digite o valor da base menor: ");
        baseMenor = teclado.nextInt();
        System.out.println("Digite o valor da altura: ");
        altura = teclado.nextInt();
        area = (baseMaior + baseMenor) * altura /2;

        System.out.println("O valor da área do trapézio é " + area + ".");

        teclado.close();
    }
}
