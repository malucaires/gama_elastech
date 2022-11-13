package aula03estruturacontrole;/*
Escrever uma classe chamada Curso, com um método chamado "escreveNome".
Usando o while, escrever "Elas Tech" por 5 vezes, usando System.out.println.
 */

public class Curso {
    public static void main(String[] args) {
        Curso c = new Curso();
        c.escreveNome();
    }

    public static void escreveNome() {
        int cont = 1;

        while (cont <= 5) {
            System.out.println("Elas Tech");
            cont++;
        }
    }
}