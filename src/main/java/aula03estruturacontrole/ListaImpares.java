/*
Escrever uma classe chamada ListaImpares, com um método chamado "listar".
Usando o while, mostrar todos os números ímpares de 1 até 100.
 */

public class ListaImpares {
    public static void main(String[] args) {
        ListaImpares l = new ListaImpares();
        l.listar();
    }

    public static void listar(){
        int numero = 1;

        while (numero <= 100) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
            numero++;
        }
    }
}