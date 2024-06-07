package Desafios;

import java.util.*;

public class JogoAdvinhacao {
    static class InnerJogoAdvinhacao {
        private int number = 0;

        InnerJogoAdvinhacao() {
            gerarNumeroAleatorio();
        };

        public void gerarNumeroAleatorio() {
            double randonNumber = Math.random() * 100;
            this.number = (int) randonNumber;        }

        public void usuarioAdivinha(){
            System.out.println("Numero aleatorio:" + number);
            Scanner scan = new Scanner(System.in);
            System.out.println("Adivinhe o numero aleatorio: ");
 
            while (true) {
                int escolha = scan.nextInt();
                
                if(escolha == this.number){
                    System.out.println("Parabens você acertou o numero!");
                    break;
                }else if(escolha < this.number){
                    System.out.println("O numero é maior. Tente Novamente!");
                }else{
                    System.out.println("O numero é menor. Tente Novamente!");
                }
            }
            scan.close();
        }
    }

    public static void main(String[] args) {
        InnerJogoAdvinhacao num = new InnerJogoAdvinhacao();
        num.usuarioAdivinha();
    }
}
