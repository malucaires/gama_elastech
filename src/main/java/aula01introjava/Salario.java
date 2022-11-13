/*
Exercício usando If-Else.
Escrever uma classe com um atributo int chamado "salario".
Criar um método chamado "informaValorImposto".
Caso o salário seja maior que 5000, retornar 15,
caso contrário, retornar 5.
 */

public class Salario {

    public static void main(String args[]) {
        Salario s = new Salario();
        System.out.println(s.informaValorImposto(3000));
    }
    public static int informaValorImposto (int salario) {
        if (salario > 5000) {
            return 15;
        } else {
            return 5;
        }
    }
}