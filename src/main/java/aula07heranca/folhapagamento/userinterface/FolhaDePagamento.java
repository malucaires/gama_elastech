package aula07heranca.folhapagamento.userinterface;

import aula07heranca.folhapagamento.model.*;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario f1, f2, f3, f4;

        f1 = new Chefe(4521, "André", 3500, 5, 500);
        f2 = new Comissionado(5248, "Bernardo", 4500,1500);
        f3 = new Horista(6584, "Camilo", 40, 65);
        f4 = new Empreteiro(7854, "Daniel", 7000);

        System.out.println(f1.getNumRegistro() + " - " + f1.getNome() + " - R$ " + f1.calcularSalario());
        System.out.println(f2.getNumRegistro() + " - " + f2.getNome() + " - R$ " + f2.calcularSalario());
        System.out.println(f3.getNumRegistro() + " - " + f3.getNome() + " - R$ " + f3.calcularSalario());
        System.out.println(f4.getNumRegistro() + " - " + f4.getNome() + " - R$ " + f4.calcularSalario());

    }
}
