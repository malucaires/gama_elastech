/*
Exercício usando If-Else.
Escrever uma classe com um atributo int chamado "hora". Criar um método chamado "verificaPeriodo".
Caso a hora esteja entre 0 e 5, escrever através de System.out.println a String "madrugada".
Caso a hora seja maior que 5 e menor que 12, escrever "manhã".
Caso a hora seja maior ou igual a 12 e menor que 18, escrever "tarde".
Caso contrário, escrever "noite".
 */

public class Periodo {

    public static void main(String args[]){
        Periodo p = new Periodo();
        System.out.println(p.verificaPeriodo(19));
    }
    public static String verificaPeriodo(int hora){
        if (hora >= 0 && hora <=5){
            return "Madrugada";
        } else if (hora < 12) {
            return "Manhã";
        } else if (hora < 18) {
            return "Tarde";
        } else {
            return "Noite";
        }
    }
}