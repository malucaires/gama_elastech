package aula07heranca.conta;

public class Conta {
    protected String nomeTitular;
    protected String cpfTitular;
    protected int numero;
    protected double saldo;

    public Conta(String nomeTitular, String cpfTitular, int numero, double saldo) {
        super();
        this.nomeTitular = nomeTitular;
        this.cpfTitular = cpfTitular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void creditar(double valor) {
        this.saldo += valor;
    }

    public boolean debitar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Número da Conta: " + this.numero + " - Nome do Titular: " + this.nomeTitular + " - CPF do Titular: "
                + this.cpfTitular + " - Saldo: R$ " + this.saldo;
    }
}
