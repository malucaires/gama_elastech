package aula04array;
/*
Criar um array de 3 elementos String, atribuindo um nome de cidade a cada elemento.
Escrever um método que liste esses nomes.
 */

public class Cidade {
    public static void main(String[] args) {
        Cidade c = new Cidade();

        String[] cidade = new String[3];
        cidade[0] = "Belo Horizonte";
        cidade[1] = "Rio de Janeiro";
        cidade[2] = "São Paulo";

        c.listaCidades(cidade);
    }

    public void listaCidades (String[] cidades){
        for (int i = 0; i < cidades.length; i++){
            System.out.println(cidades[i]);
        }
    }
}