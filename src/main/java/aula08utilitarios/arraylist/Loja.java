package aula08utilitarios.arraylist;

import java.util.ArrayList;

public class Loja {
    public static void main(String[] args) {

        /*
        Produto lista[];
        lista = new Produto[5];

        lista[0] = new Produto(1, "Computador", 1500);
        lista[1] = new Produto(2, "Mouse", 30);
        lista[2] = new Produto(3, "Teclado", 80);
        lista[3] = new Produto(4, "Monitor", 400);
        lista[4] = new Produto(5, "Impressora", 650);
        */

        ArrayList<Produto> lista = new ArrayList<>();

        lista.add(new Produto(1, "Computador", 1500));
        lista.add(new Produto(2, "Mouse", 30));
        lista.add(new Produto(3, "Teclado", 80));
        lista.add(new Produto(4, "Monitor", 400));
        lista.add(new Produto(5, "Impressora", 650));

        for (Produto p : lista) {
            System.out.println(p);
        }
    }
}
