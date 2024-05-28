package Aula7;

public class ReferenciandoAtributosSuper {
    String status = "status da filha";

    public void imprimir() {
        System.out.println(status);
        System.out.println(super.status);
    }
}
