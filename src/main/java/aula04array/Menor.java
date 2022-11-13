/*
Criar um array de 4 elementos Integer, atribuindo um valor diferente a cada elemento.
Escrever um método que encontre o menor valor dessa array.
 */

public class Menor {
    public static void main(String[] args) {
        Menor m = new Menor();

        int[] conjunto = new int[4];
        int menor;

        conjunto[0] = 6;
        conjunto[1] = 5;
        conjunto[2] = 3;
        conjunto[3] = 4;

        menor = m.encontraMenorValor(conjunto);

        System.out.println(menor);
    }

    public int encontraMenorValor (int conjunto[]) {
        int menor = conjunto[0];
        for (int i = 0; i < conjunto.length; i++) {
            if (menor > conjunto[i]) {
                menor = conjunto[i];
            }
        }
        return menor;
    }
}