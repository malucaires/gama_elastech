/*
Escrever uma classe, com um método chamado "escreveTabuada".
Usar um loop for que faça a tabuada do 2.
Na mesma classe, criar um método chamado "imprimeTodasTabuadas".
Usando o for, imprimir as tabuadas de 1 a 9.
 */

public class Tabuada {
    public static void main(String[] args) {
        Tabuada t = new Tabuada();
        //t.escreveTabuada();
        t.imprimeTodasTabuadas();
    }

    public static void escreveTabuada(){
        for (int i = 0; i < 10; i++){
            System.out.println("2 x " + i + " = " + (i * 2));
        }
    }

    public static void imprimeTodasTabuadas(){
        for (int i = 1; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}