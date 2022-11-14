package aula06poo;

import java.util.Scanner;

public class ContaBancariaMain {

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(1450, 3, "André", "14525635415",0);

        Scanner teclado = new Scanner(System.in);
        int opcao;
        double valor;
        boolean saque;

        do {
            System.out.println("- - - - - - - - - -");
            System.out.println("MENU");
            System.out.println("Opção 1: Depósito");
            System.out.println("Opção 2: Saque");
            System.out.println("Opção 3: Info");
            System.out.println("Opção 0: Sair");
            opcao = teclado.nextInt();
            if (opcao == 1 || opcao == 2) {
                System.out.println("Digite o valor: R$ ");
                valor = teclado.nextDouble();
                if (opcao == 1){
                    c1.depositar(valor);
                    System.out.println("Depósito realizado.");
                } else {
                    saque = c1.sacar(valor);
                    if (saque == true) {
                        System.out.println("Saque realizado com sucesso.");
                    } else {
                        System.out.println("Não há saldo suficiente. Saque não realizado.");
                    }
                }
            } else if (opcao == 3) {
                c1.exibirDados();
            } else if (opcao != 0){
                System.out.println("Opção inválida. Tente novamente");
            }
        } while (opcao != 0);


        teclado.close();
    }


}
