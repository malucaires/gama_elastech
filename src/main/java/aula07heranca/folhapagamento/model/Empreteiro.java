package aula07heranca.folhapagamento.model;

public class Empreteiro extends Funcionario {
    private double valorEmpreita;

    public Empreteiro(int numRegistro, String nome, double valorEmpreita) {
        super(numRegistro, nome);
        this.valorEmpreita = valorEmpreita;
    }

    public double getValorEmpreita() {
        return valorEmpreita;
    }

    public void setValorEmpreita(double valorEmpreita) {
        this.valorEmpreita = valorEmpreita;
    }

    @Override
    public double calcularSalario() {
        return this.valorEmpreita;
    }
}
