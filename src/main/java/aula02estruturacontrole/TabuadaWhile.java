import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numero;
        int cont = 1;

        System.out.println("Digite um número: ");
        numero = s.nextInt();

        while (cont <= 10) {
            System.out.println(numero + " x " + cont + " = " + (numero * cont));
            cont++;
        }

        s.close();
    }
}