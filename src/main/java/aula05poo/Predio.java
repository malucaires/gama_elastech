package aula05poo;/*
Crie uma classe chamada Predio, contendo os seguintes atributos: endereco, cidade, estado, numAptos.
Crie apenas o construtor padrão. Crie métodos get e set para todos os atributos.
No método setNumAptos, verifique se o número de apartamentos passados é maior que 0.
Crie um método main, nessa mesma classe, e instancie 2 objetos de Predio utilizando a palavra reservada new,
usando os setters para passar os valores de cada atributo.
 */

public class Predio {

    private String endereco;
    private String cidade;
    private String estado;
    private int numAptos;

    public Predio() {

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumAptos() {
        return numAptos;
    }

    public void setNumAptos(int numAptos) {
        if (numAptos > 0) {
            this.numAptos = numAptos;
        } else {
            System.out.println("Número de Apartamentos inválido.");
        }
    }

    public static void main(String[] args) {
        Predio p1 = new Predio();

        p1.setCidade("Belo Horizonte");
        p1.setEndereco("Rua Lagoa Dourada");
        p1.setEstado("MG");
        p1.setNumAptos(5);

        Predio p2 = new Predio();

        p2.setCidade("Rio de Janeiro");
        p2.setEndereco("Avenida Brasil");
        p2.setEstado("RJ");
        p2.setNumAptos(3);

        System.out.println("PRÉDIO 1");
        System.out.println("Cidade: " + p1.getCidade());
        System.out.println("Endereço: " + p1.getEndereco());
        System.out.println("Estado: " + p1.getEstado());
        System.out.println("Número de Apartamentos: " + p1.getNumAptos());

        System.out.println("PRÉDIO 2");
        System.out.println("Cidade: " + p2.getCidade());
        System.out.println("Endereço: " + p2.getEndereco());
        System.out.println("Estado: " + p2.getEstado());
        System.out.println("Número de Apartamentos: " + p2.getNumAptos());
    }
}