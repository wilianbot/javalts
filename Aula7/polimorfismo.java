package Aula7;

// Polimorfismo é a capacidade de um objeto se comportar como outro em 
// tempo de execução.


// Uma classe abstrata tem duas finalidades
// Servir de base para outraas classes
// Obrgas as classes derivadas a implementar certos métodos

public class polimorfismo {
    static class Pai {
        public void imprimir() {
            System.out.println("Eu sou o Pai");
        }
    }

    static class Filha extends Pai {
        public void imprimir() {
            System.out.println("Eu sou a Filha");
        }
    }

    public static void main(String[] args) {
        Pai a = new Pai();
        a.imprimir(); // status do pai

        Filha b = new Filha();
        b.imprimir(); // status da filha

        a = b;
        a.imprimir(); // status da filha
    }
}

