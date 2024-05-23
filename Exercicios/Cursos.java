package Exercicios;

class Ex1 {
    static class Cursos {
        public Cursos(){
        }

        public void print() {
            String name = new String("Java");
            float valor = 179;
            String resultado = new String("O nome do curso é " + name + " e o valor é " + valor);
            System.out.print(resultado); 
        }
    }

    public static void main(String[] args) {
        Cursos java;
        java = new Cursos();
        java.print();
    }
}