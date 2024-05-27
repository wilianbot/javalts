package Aula6;

public class Construtor {
    public String status = "";

    public Construtor() {
        status = "Construtor Padrão"; // Construtor Padrão
    }

    public static void main(String[] args) {
        Construtor c = new Construtor();
        System.out.println("Status:" + c.status);
    }
}
