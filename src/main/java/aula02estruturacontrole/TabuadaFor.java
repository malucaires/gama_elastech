import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número: ");
        numero = s.nextInt();

        for (int cont = 1; cont <= 10; cont++) {
            System.out.println(numero + " x " + cont + " = " + (numero * cont));
        }

        s.close();
    }
}