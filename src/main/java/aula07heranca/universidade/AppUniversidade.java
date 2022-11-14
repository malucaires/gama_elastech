package aula07heranca.universidade;

public class AppUniversidade {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("André", "andre@andre.com", "963552147");

        System.out.println(p.exibirInfo());

        Estudante e = new Estudante("Bernardo", "bernardo@bernardo.com",
                "996558545", 4952, "Fisica");

        System.out.println(e.exibirInfo());

    }
}
