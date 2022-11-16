package aula09exerciciosextra;

/*
Crie uma classe chamada Impressao.
Crie um método que imprimaF (utilize System.out.println) os números de 1 a 10 usando o loop for.
Crie um método que imprimaW (utilize System.out.println) os números de 1 a 10 usando o loop while.
 */

public class Impressao {
    public void imprimaF(Integer numeros[]) {
        for (Integer i : numeros) {
            System.out.println(i);
        }
    }

    public void imprimaW(Integer numeros[]){
        int i = 0;
        while (i < numeros.length) {
            System.out.println(numeros[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        Impressao imp = new Impressao();

        Integer numeros[] = new Integer[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = i + 1;
        }

        imp.imprimaF(numeros);
        imp.imprimaW(numeros);
    }
}
