package Aula6;

public class Objetos {
    // Orientação a objetos
    static class Carros {
        // Atributos de classe
        public String cor = "";
        public String modelos = "";
        public String motor = "";

        // Metodos de classes
        public void ligar (){
            System.out.println("Ligando o carro");
        }
        public void desligar (){
            System.out.println("Desligando o carro");
        }
        public void acelerar (){
            System.out.println("Acelerando o carro");
        }
        public void brecar (){
            System.out.println("Brecando o carro");
        }
        void mudarMarcha (){
            System.out.println("Marcha engatada");
        }
    }

    public static void main(String[] args) {
        // Instância de classe é uma cópia da classe na memória.
        Carros c1 = new Carros();
        Carros c2 = new Carros();

        c1.modelos = "Siena";
        c1.cor = "Vermelho";
        c1.motor = "1.4";

        c2.modelos = "Fox";
        c2.cor = "Prata";
        c2.motor = "2.0";

        c1.ligar();
        c1.desligar();
        c1.acelerar();
        c1.brecar();
        c1.mudarMarcha();

        c2.ligar();
    }

}
