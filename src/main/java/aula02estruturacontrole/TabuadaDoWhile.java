import java.util.Scanner;

public class TabuadaDoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numero;
        int cont = 1;

        System.out.println("Digite um número: ");
        numero = s.nextInt();

         do {
            System.out.println(numero + " x " + cont + " = " + (numero * cont));
            cont++;
        } while (cont <= 10);

        s.close();
    }
}