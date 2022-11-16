package aula09exerciciosextra;
/*
Crie uma classe chamada MultiplosDeQuatro.
Crie um método que imprima apenas os números múltiplos de 4.
 */

public class MultiplosDeQuatro {

    public void imprimaMultiplosQuatro(Integer numeros[]) {
        for (Integer i : numeros) {
            if (i % 4 == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        MultiplosDeQuatro m = new MultiplosDeQuatro();

        Integer numeros[] = new Integer[100];

        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        m.imprimaMultiplosQuatro(numeros);
    }
}
