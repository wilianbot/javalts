package Exercicios;
import java.util.Scanner;

public class Nota {
    static class NotaAluno {
        private int value = 0;
        public NotaAluno(){
        }

        public void verficacao(){
            Scanner scan = new Scanner(System.in);
            value = scan.nextInt();

            if(value < 0 || value > 10){
                System.out.println("Valor invalido");
            }else if(value < 5){
                System.out.println("Reprovado");
            }else if(value < 7){
                System.out.println("Em recuperação");
            }else{
                System.out.println("Aprovado");
            }
            scan.close();
        }

        public static void main(String[] args) {
            NotaAluno not = new NotaAluno();
            not.verficacao();
        }
    }
}
