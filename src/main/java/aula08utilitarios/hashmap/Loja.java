package aula08utilitarios.hashmap;

import java.util.HashMap;

public class Loja {
    public static void main(String[] args) {

        HashMap<Integer, Produto> mapa = new HashMap<Integer, Produto>();

        mapa.put(1, new Produto(1, "Computador", 1500));
        mapa.put(2, new Produto(2, "Mouse", 30));
        mapa.put(3, new Produto(3, "Teclado", 80));
        mapa.put(4, new Produto(4, "Monitor", 400));
        mapa.put(5, new Produto(5, "Impressora", 650));

        int codigoAbuscar = 3;

        Produto p = mapa.get(codigoAbuscar);
        if (p != null) {
            System.out.println("Encontrei o produto " + p);
        } else {
            System.out.println("Produto não encontrado");
        }
    }
}
