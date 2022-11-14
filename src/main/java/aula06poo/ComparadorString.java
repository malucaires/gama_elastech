package aula06poo;

public class ComparadorString {

    public static void main(String[] args) {
        String s1, s2;

        s1 = new String("Oi, tudo bem?");
        s2 = new String("Oi, tudo bem?");

        if (s1 == s2) {
            System.out.println("Endereço igual de memória.");
        } else {
            System.out.println("Endereço diferente de memória.");
        }

        if (s1.equals(s2)){
            System.out.println("Conteúdo igual.");
        } else {
            System.out.println("Conteúdo diferente.");
        }
    }
}
