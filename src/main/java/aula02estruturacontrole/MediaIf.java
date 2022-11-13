import java.util.Scanner;

public class MediaIf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double n1, n2, media;
        System.out.println("Digite o valor da nota 1: ");
        n1 = s.nextDouble();
        System.out.println("Digite o valor da nota 2: ");
        n2 = s.nextDouble();
        media = (n1 + n2) / 2;

        String conceito;

        if (media >= 9.0) {
            conceito = "Conceito A.";
        } else if (media >= 8.0) {
            conceito = "Conceito B.";
        } else if (media >= 7.0) {
            conceito = "Conceito C";
        } else if (media >= 6.0) {
            conceito = "Conceito D";
        } else {
            conceito = "Conceito F";
        }

        System.out.println("Sua média final é " + media + ". " + conceito);

        s.close();
    }
}