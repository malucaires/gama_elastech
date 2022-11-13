/*
Exercício 10
Sabendo que o valor de 100kw corresponde a 1/7 do valor do salário mínimo,
faça um algoritmo que receba o valor do salário mínimo e a quantidade de kw
gasto por uma residência e calcule: a) o valor em reais de cada kw.
b) o valor em reais a ser pago. c) o novo valor a ser pago com desconto de 10%.
*/

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double salarioMinimo, gastoKW, valorKW, valorTotal, valorDesconto;

        System.out.println("Digite o valor do salário mínimo: ");
        salarioMinimo = teclado.nextDouble();
        valorKW = (salarioMinimo / 7) / 100;
        System.out.println("Digite a quantidade gasta de kW: ");
        gastoKW = teclado.nextDouble();
        valorTotal = gastoKW / 100 * valorKW;
        valorDesconto = valorTotal * 0.9;

        System.out.println("Valor em reais de cada kW: R$ " + valorKW);
        System.out.println("Valor a ser pago: R$ " + valorTotal);
        System.out.println("Valor com desconto de 10%: R$ " +valorDesconto);

        teclado.close();
    }
}