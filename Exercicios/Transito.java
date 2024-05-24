package Exercicios;

public class Transito {
    static class InnerTransito {
        public InnerTransito(){
            int[][] trans = {};
            trans[5][12] = 20;
            trans[5][23] = 40;
            trans[10][10] = 45;
            trans[22][19] = 70;
            trans[31][2] = 10; 
        }


        public static void main(String[] args) {
            InnerTransito tra = new InnerTransito();
        }
    }
}
