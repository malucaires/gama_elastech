package aula06poo;

public class ContaBancaria {
    private int numeroConta;
    private int digitoVerificador;
    private String nomeTitular;
    private String cpf;
    private double saldo;

    public ContaBancaria(int numeroConta, int digitoVerificador, String nomeTitular, String cpf, double saldo) {
        super();
        this.numeroConta = numeroConta;
        this.digitoVerificador = digitoVerificador;
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(int digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito) {
        this.saldo = this.saldo + deposito;
    }

    public boolean sacar(double saque) {
        if (saque > saldo) {
            return false;
        } else {
            this.saldo = this.saldo - saque;
            return true;
        }
    }

    public void exibirDados() {
        System.out.println("- - - - - - - - - -");
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Digito verificador: " + this.digitoVerificador);
        System.out.println("Nome do Titular: " + this.nomeTitular);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Saldo: R$ " + String.format("%.2f",this.saldo));
    }
}
