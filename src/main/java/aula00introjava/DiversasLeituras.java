import java.util.Scanner;

public class DiversasLeituras{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo;
        double preco;
        String texto, nome;
        System.out.println("Digite o código do produto: ");
        texto = teclado.nextLine();
        codigo = Integer.parseInt(texto);
        System.out.println("Digite o preço do produto: ");
        texto = teclado.nextLine();
        preco = Double.parseDouble(texto);
        System.out.println("Digite o nome do produto: ");
        nome = teclado.nextLine();
        System.out.println("Código = " + codigo + ". Preço = R$ " + preco + ". Nome = " + nome);
        teclado.close();
        System.out.printf("Código = %d. Preço = R$ %.2f. Nome = %s.\n", codigo, preco, nome);
    }
}