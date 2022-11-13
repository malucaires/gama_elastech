/*
Criar um array de 5 elementos Integer, atribuindo um valor a cada elemento.
Escrever um método que encontre a soma de todos os valores.
 */

public class Soma {
    public static void main(String[] args) {
        int[] conjunto = new int[5];

        Soma s = new Soma();

        conjunto[0] = 3;
        conjunto[1] = 5;
        conjunto[2] = 4;
        conjunto[3] = 2;
        conjunto[4] = 6;

        int soma = s.somaNumeros(conjunto);
        System.out.println(soma);
    }

    public int somaNumeros(int[] conjunto){
        int soma = 0;
        for (int i = 0; i < conjunto.length; i++) {
            soma += conjunto[i];
        }
        return soma;
    }
}