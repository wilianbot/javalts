package Exercicios;

import java.util.Scanner;

public class Ex2DiaSemana {
    static class DiaSemana {
        private int dia = 0;
        public DiaSemana(){
        }
        
        public void verficacao(){
            System.out.println("\n");
            System.out.println("Digite um dia da Semana: ");
            Scanner scan = new Scanner(System.in);
            dia = scan.nextInt(); 

            switch(dia) {
                case 1:
                    System.out.println("Segunda-Feira");
                    break;
                case 2:
                    System.out.println("Terça-feira");
                    break;
                case 3:
                    System.out.println("Quarta-feira");
                    break;
                case 4:
                    System.out.println("Quinta-feira");
                    break;
                case 5:
                    System.out.println("Sexta-feira");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Valor invalido");
            }
            scan.close();
        }

        public static void main(String[] args) {
            DiaSemana not = new DiaSemana();
            not.verficacao();
        }
    }
}
