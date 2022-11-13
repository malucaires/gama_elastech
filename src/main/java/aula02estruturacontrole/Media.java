import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double n1, n2, media;
        System.out.println("Digite o valor da nota 1: ");
        n1 = s.nextDouble();
        System.out.println("Digite o valor da nota 2: ");
        n2 = s.nextDouble();
        media = (n1 + n2) / 2;

        String situacao;

        if (media >= 6) {
            situacao = "APROVADO.";
        } else {
            situacao = "REPROVADO.";
        }

        System.out.println("Sua média final é " + media + ". Você foi " + situacao);

        s.close();
    }
}