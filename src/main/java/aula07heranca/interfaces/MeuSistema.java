package aula07heranca.interfaces;

public class MeuSistema {
    public static void main(String[] args) {
        InterfaceBD ibd;

        ibd = new BDMysql();

        ibd.conectar();

        ibd.executar("SELECT * FROM tb_clientes");

        ibd.desconectar();

    }
}
