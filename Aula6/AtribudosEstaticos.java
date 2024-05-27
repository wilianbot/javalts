package Aula6;

public class AtribudosEstaticos {
    static class Carro {
        // atributos de classe
        
        public static String cor = "";
        public String modelo = "";
        public String motor = "";
    }

    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.modelo = "Fox";
        c1.cor = "Prata";

        System.out.println(c1.modelo);
        System.out.println(c1.cor);

        c2.modelo = "Civic";
        c2.cor = "Vermelho";

        System.out.println(c2.modelo);
        System.out.println(c2.cor);
    }
}
