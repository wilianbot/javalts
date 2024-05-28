package Aula7;

/* Overriding (sobrescrita) ocorre quando um método de uma superclasse é sobrescrito
por um método de mesmo nome de uma sublass.
*/

// Classe Pai

    class Animal {
        // Metodo a ser sobrescrito
        public void fazerSom() {
            System.out.println("Animal fazendo algum som...");
        }
    }

    // Classe Filha que herda de Animal
    class Cachorro extends Animal {
        // Sobrescrevendo o método fazerSom  da classe pai
        @Override
        public void fazerSom() {
            System.out.println("Au au!");
        }
    }

    // Classe principal
    public class Overriding {
        public static void main(String[] args) {
            // Criando uma instância de Cachorro
            Cachorro ca = new Cachorro();

            // Chamando o método fazerSom da classe Cachorro
            ca.fazerSom();
        }

}
