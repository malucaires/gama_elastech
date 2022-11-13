/*
Exercício 07
Calcular o volume de um paralelepípedo (V = base * altura * profudindade)
*/

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int volume, base, altura, profundidade;

        System.out.println("Digite a base do paralelepípedo: ");
        base = teclado.nextInt();
        System.out.println("Digite a altura do paralelepípedo: ");
        altura = teclado.nextInt();
        System.out.println("Digite a profundidade do paralelepípedo: ");
        profundidade = teclado.nextInt();
        volume = base * altura * profundidade;

        System.out.println("O volume do paralelepípedo é: " + volume + ".");

        teclado.close();
    }
}