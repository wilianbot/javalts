package Aula7;

abstract class Abstrata {
    abstract class FormaGeometrica {
        private double area; // Área da forma geométrica

        // Método abstrato para calcular a área
        public abstract double calculaArea();

        // Método concreto para obter a área 
        public double getArea() {
            return area;
        }

        // Método para definir a área
        public void setArea(double area) {
            this.area = area;
        }
    }

    class Retangulo extends FormaGeometrica {
        private double base;
        private double altura;

        public Retangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calculaArea(){
            return base * altura;
        }
    }

    public static void main(String[] args) {
        
        Retangulo teste = new Retangulo(5.0, 3.0);
        
        double area = teste.calculaArea();
        System.out.println("Área do retângulo: " + area);
    }
}
