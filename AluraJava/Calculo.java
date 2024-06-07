package AluraJava;

import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        int escolha = 0;
        double quadrado = 0;
        double circulo = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Calcular área do quadrado.");
        System.out.println("2. Calcular área do círculo.");
        escolha = scan.nextInt();

        if (escolha == 1) {
            System.out.println("Digite o lado do quadrado: ");
            double lado = scan.nextDouble();
            quadrado = lado * lado;
            System.out.println("O calculo do quadrado: " + quadrado);
        }else {
            System.out.println("Digite o raio do circulo: ");
            double raio = scan.nextDouble();
            circulo = Math.PI * raio * raio;
            System.out.println("O caculo do circulo: " + circulo);
        }
    }
}
