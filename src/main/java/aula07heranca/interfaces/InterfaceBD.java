package aula07heranca.interfaces;

public interface InterfaceBD {
    public void conectar();
    public void desconectar();
    public void executar(String comando);
}
