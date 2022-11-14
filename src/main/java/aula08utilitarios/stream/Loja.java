package aula08utilitarios.stream;

import aula08utilitarios.arraylist.Produto;

import java.util.ArrayList;
import java.util.Comparator;

public class Loja {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();

        lista.add(new Produto(1, "Computador", 1500));
        lista.add(new Produto(2, "Mouse", 30));
        lista.add(new Produto(3, "Teclado", 80));
        lista.add(new Produto(4, "Monitor", 400));
        lista.add(new Produto(5, "Impressora", 650));
        lista.add(new Produto(6, "Notebook", 2500));

        lista.stream().forEach((p) -> {
            System.out.println(p);
        });

        System.out.println("Produtos em ordem alfabética");
        lista.stream().sorted(Comparator.comparing(p->p.getNome()))
                .forEach((p) -> System.out.println(p));

        System.out.println("Produtos em ordem de preço");
        lista.stream().sorted(Comparator.comparing(p->p.getPreco()))
                .forEach((p) -> System.out.println(p));
    }
}
