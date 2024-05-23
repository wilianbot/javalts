package Exercicios;

public class Ex3Repeticao {
    static class Repeticao{
        private int num = 100;
        public Repeticao(){
        }

        public void calculoFor(){
            for(int i = 0; i < num; i++){
                if ((i % 2) == 0) {
                    System.out.println(i);
                }
            }
        }

        public void calculoWhile() {
            int i = 0;
            while (i < num) {
                if ((i % 2) == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
        
        public static void main(String[] args) {
            Repeticao not = new Repeticao();
            not.calculoWhile();
        }
    }
}
