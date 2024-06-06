package Aula7.interfaceTeste;


public interface FormaGeometrica {

        double calcularArea(); // Método abstrato para calcular a área
        double getPerimetro(); // Método abstrato para calcular o perimetro       

        class Retangulo implements FormaGeometrica {
            private double base;
            private double altura;

            public Retangulo(double base, double altura){
                this.base = base;
                this.altura = altura;
            }

            @Override
            public double calcularArea(){
                return base * altura;
            }

            @Override
            public double getPerimetro(){
                return 2 * (base + altura);
            }
        }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5.0, 3.0);
        retangulo.calcularArea();    
        retangulo.getPerimetro();    
    }
}

