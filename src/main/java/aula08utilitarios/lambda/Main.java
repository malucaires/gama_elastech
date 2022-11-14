package aula08utilitarios.lambda;

public class Main {
    public static void main(String[] args) {
        InterfaceServico i = new InterfaceServico() {
            @Override
            public void executa() {
                System.out.println(("Executa algo"));
            }
        };

        i.executa();

        InterfaceServico i2 = () -> {
            System.out.println(("Outra lógica de execução"));
        };

        i2.executa();
    }
}
