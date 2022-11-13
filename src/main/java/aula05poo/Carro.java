package aula05poo;
/*
Crie uma classe chamada Carro, contendo os seguintes atributos: numPortas, ano, preco, kilometragem e marca.
Crie dois construtores: o padrão e um construtor que receba a marca e a cor desse carro.
Crie métodos get e set para todos os atributos.
Crie um método main, nessa mesma classe, e instâncie 2 objetos de Carro utilizando a palavra reservada new,
usando os setters para passar os valores de cada atributo.
 */

public class Carro {

    private int numPortas;
    private int ano;
    private double preco;
    private int kilometragem;
    private String marca;
    private String cor;

    public Carro() {
    }


    public Carro(String marca, String cor) {
        setMarca(marca);
        setCor(cor);
    }


    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setAno(2019);
        c1.setCor("Preto");
        c1.setKilometragem(10000);
        c1.setPreco(30000);
        c1.setNumPortas(4);
        c1.setMarca("BMW");

        System.out.println("CARRO 1");
        System.out.println("Ano: " + c1.getAno());
        System.out.println("Cor: " + c1.getCor());
        System.out.println("Kilometragem: " + c1.getKilometragem());
        System.out.println("Preço: R$ " + c1.getPreco());
        System.out.println("Número de Portas: " + c1.getNumPortas());
        System.out.println("Marca: " + c1.getMarca());

        Carro c2 = new Carro("Audi","Vermelho");
        c2.setAno(2018);
        c2.setKilometragem(15000);
        c2.setPreco(40000);
        c2.setNumPortas(4);

        System.out.println("CARRO 2");
        System.out.println("Ano: " + c2.getAno());
        System.out.println("Cor: " + c2.getCor());
        System.out.println("Kilometragem: " + c2.getKilometragem());
        System.out.println("Preço: R$ " + c2.getPreco());
        System.out.println("Número de Portas: " + c2.getNumPortas());
        System.out.println("Marca: " + c2.getMarca());
    }
}