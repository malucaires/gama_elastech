/*
Escrever uma classe chamada ListaPares, com um método chamado "listar".
Usando o while, mostrar todos os números pares de 1 até 100.
 */

public class ListaPares {
    public static void main(String[] args) {
        ListaPares l = new ListaPares();
        l.listar();
    }

    public static void listar(){
        int numero = 1;

        while (numero <= 100) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
            numero++;
        }

    }
}