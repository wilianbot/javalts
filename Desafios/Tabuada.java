package Desafios;
import java.util.Scanner;

public class Tabuada {
    static class InnerTabuada {
        private int valor = 0;
        private int mult = 0;
        InnerTabuada(){
        }

        public void Calculo() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um numero para tabuada: ");
            valor = scan.nextInt();   

            System.out.println("===================");
            System.out.println("=   Tabuada de " + valor + "  =");
            System.out.println("===================");

            for(int i = 1; i <= 10; i++){
                mult = valor * i;
                System.out.println(valor + "x" + i + " = "+ mult);
            }
            scan.close();
        }
        
    }

    public static void main(String[] args) {
        InnerTabuada cal = new InnerTabuada();
        cal.Calculo();
    }
}
