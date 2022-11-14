package aula07heranca.conta;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(String nomeTitular, String cpfTitular, int numero, double saldo, double limite) {
        super(nomeTitular, cpfTitular, numero, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString(){
        return super.toString() + " - Limite: R$ " + this.limite;
    }

    @Override
    public boolean debitar(double valor) {
        if (super.saldo + this.limite >= valor) {
            super.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}
