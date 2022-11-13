/*
Exercício 01
Entrar com um número de 3 dígitos e inverte-los: Ex 123 -> 321
 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numeroOriginal, numeroFinal, c, d, u;

        System.out.println("Digite um número de 3 dígitos: ");
        numeroOriginal = teclado.nextInt();

        c = numeroOriginal/100;
        d = (numeroOriginal - c*100)/10;
        u = (numeroOriginal - c*100 - d*10);

        numeroFinal = u*100 + d*10 + c;
        System.out.printf("O número digitado foi %d", numeroFinal);

        teclado.close();
    }
}
