package Aula7;

public class heranca_extends {
   public static void main(String[] args) {
    
        // Classe pai (superclasse)
    class Veiculo {
        protected String brand;

        public Veiculo(String brand) {
            this.brand = brand;
        }

        public void displayInfo() {
            System.out.println("Brand: " + brand);
        }
    }

        // Classe fila (subclasse) que estende (extends) Veiculo
    class Car extends Veiculo {
        private int numOfDoors;

        public Car(String brand, int numOfDoors) {
            super(brand);
            this.numOfDoors = numOfDoors;
        }

        // Sobrescreve o método displaInfo()da classe pai
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Number of doors: " + numOfDoors);
        }
    }
   } 
}
