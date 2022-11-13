/*
Escrever uma classe, com um método chamado "escreveTabuada".
Usar um loop for que faça a tabuada do 2 utilizando String Buffer.
 */

public class TabuadaStringBuffer {
    public static void main(String[] args) {
        Tabuada t = new Tabuada();
        t.escreveTabuada();
    }

    public static void escreveTabuada(){
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 10; i++){
            int resultado = 2 * i;

            sb.append("2 * ").append(i);
            sb.append(" = ");
            sb.append(resultado);
            sb.append(System.getProperty("line.separator"));
        }

        System.out.println(sb.toString());
    }
}