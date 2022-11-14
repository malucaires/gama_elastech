package aula07heranca.interfaces;

public class BDMysql implements InterfaceBD {

    @Override
    public void conectar() {
        System.out.println("Conectando com o MySQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando com o MySQL");
    }

    @Override
    public void executar(String comando) {
        System.out.println("musql> " + comando);
    }
}
