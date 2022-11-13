/*
Você deve fazer um programa que leia um número de ponto flutuante e imprima uma mensagem dizendo em qual
dos seguintes intervalos o número pertence: [0,25] (25,50], (50,75], (75,100).
Se o número for menor que zero ou maior que 100, o programa deve imprimir a mensagem “Fora de intervalo”.
O símbolo '(' representa maior que. Por exemplo:
[0,25] indica números entre 0 e 25,0000, incluindo ambos.
(25,50] indica números maiores que 25 (25,00001) até 50,0000000.
 */

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float numero;
        System.out.println("Digite um número de ponto flutuante");
        numero = s.nextFloat();

        if (numero >= 0 && numero <= 25){
            System.out.println("Intervalo [0,25]");
        } else if (numero > 25 && numero <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (numero > 50 && numero <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (numero > 75 && numero <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        s.close();
    }
}