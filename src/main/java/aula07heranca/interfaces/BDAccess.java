package aula07heranca.interfaces;

public class BDAccess implements InterfaceBD {

    @Override
    public void conectar() {
        System.out.println("Conectando com o banco Access.");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando com o banco Access.");
    }

    @Override
    public void executar(String comando) {
        System.out.println("ms-access> " + comando);
    }
}
