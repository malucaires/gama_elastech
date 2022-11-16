package aula09exerciciosextra.colaborador;

import java.util.ArrayList;
import java.util.stream.Collectors;

/*
Crie uma classe PessoaColaboradora, que possua uma String "nome" e um parâmetro decimal, que representa o salário.
Crie uma lista com alguns PessoaColaboradoras e, através de Streams, aplique um aumento de 15% para todas as pessoas.
 */

public class Principal {

    public static void main(String[] args) {

        ArrayList<PessoaColaboradora> lista = new ArrayList<PessoaColaboradora>();
        lista.add(new PessoaColaboradora("André", 1000));
        lista.add(new PessoaColaboradora("Bernardo", 2000));
        lista.add(new PessoaColaboradora("Carla", 3000));
        lista.add(new PessoaColaboradora("Daniel", 4000));

        lista.stream().map(p ->
                {
                    p.setSalario(p.getSalario() + (p.getSalario() * 0.15));
                    return p;
                }
        ).collect(Collectors.toList());

        lista.forEach(p -> System.out.println(p.getNome() + " - " + p.getSalario()));
    }
}
