package aula06poo;

public class Utilitarios {

    public static int soma(int x, int y) {
        return x + y;
    }

    public static int potencia(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            int pot = 1;
            for (int cont = 1; cont < y; cont++) {
                pot = pot * x;
            }
            return pot;
        }
    }
}
