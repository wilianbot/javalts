package Aula7;

public class classefisica {
    public static void main(String[] args) {
        String status = "";
        Fisica c = new Fisica();
        c.setCodigo(999);
        c.setNome("Alice");
        c.setCpf("999.999.999-99");
        c.incluir();
        status = c.getStatus();
        System.out.println("Status: " + status);
    }
}
