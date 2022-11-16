package aula09exerciciosextra.cidade;

public class Cidade {
    private int habitantes;
    private String nome;

    public Cidade(int habitantes, String nome) {
        this.habitantes = habitantes;
        this.nome = nome;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
