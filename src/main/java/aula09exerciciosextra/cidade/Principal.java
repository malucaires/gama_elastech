package aula09exerciciosextra.cidade;

import java.util.ArrayList;

/*
Crie uma classe Cidade, com um parâmetro inteiro "habitantes" e um String "nome".
Crie uma lista com algumas cidades e, através de Streams,
execute um filtro que exiba apenas os nomes das cidades com mais de 100 mil habitantes.
 */
public class Principal {
    public static void main(String[] args) {

        ArrayList<Cidade> lista = new ArrayList<Cidade>();

        lista.add(new Cidade(150000, "Cidade 1"));
        lista.add(new Cidade(80000, "Cidade 2"));
        lista.add(new Cidade(20000, "Cidade 3"));
        lista.add(new Cidade(1050000, "Cidade 4"));

        lista.stream()
                .filter(c -> c.getHabitantes() > 100000)
                .forEach(c -> System.out.println(c.getNome()));
    }
}
