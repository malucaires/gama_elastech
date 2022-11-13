package aula01introjava;/*
Exercício usando Operador Ternário.
Escrever uma classe com um atributo int chamado "salario".
Criar um método chamado "informaValorImposto".
Caso o salário seja maior que 5000, retornar 15,
caso contrário, retornar 5.
 */

public class Imposto {

    public static void main(String args[]) {
        Imposto i = new Imposto();
        System.out.println(informaValorImposto(3000));
    }

    public static int informaValorImposto (int salario) {
        int imposto = (salario > 5000) ? 15 : 5;
        return imposto;
    }
}