/*
Exercício usando Switch.
Escrever uma classe com um atributo int chamado "mes".
Criar um método chamado "escreverMesExtenso".
Caso o "mes" seja igual a 1, escrever através de System.out.println a String "Janeiro" e assim por diante.
 */

public class Mes {

    public static void main(String args[]) {
        Mes m = new Mes();
        System.out.println(m.escreverMesExtenso(2));
    }
    public static String escreverMesExtenso(int mes) {
        String extenso;
        switch (mes) {
            case 1:
                extenso = "Janeiro";
                break;
            case 2:
                extenso = "Fevereiro";
                break;
            case 3:
                extenso = "Março";
                break;
            case 4:
                extenso = "Abril";
                break;
            case 5:
                extenso = "Maio";
                break;
            case 6:
                extenso = "Junho";
                break;
            case 7:
                extenso = "Julho";
                break;
            case 8:
                extenso = "Agosto";
                break;
            case 9:
                extenso = "Setembro";
                break;
            case 10:
                extenso = "Outubro";
                break;
            case 11:
                extenso = "Novembro";
                break;
            case 12:
                extenso = "Dezembro";
                break;
            default:
                extenso = "Número inválido";
        }
        return extenso;
    }
}