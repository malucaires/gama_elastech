package aula07heranca.conta;

public class PIBank {
    public static void main(String[] args) {
        Conta c1 = new Conta("André","22544855632",2545,100);
        ContaEspecial c2 = new ContaEspecial("João","44855211485",4857,100, 100);

        System.out.println(c1);
        System.out.println(c2);

        c1.debitar(100);
        c2.debitar(150);

        System.out.println(c1);
        System.out.println(c2);
    }
}
