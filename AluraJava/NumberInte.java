package AluraJava;

import java.util.Scanner;

public class NumberInte {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Number1, Number2 = 0;

        System.out.println("Digite o primeiro numero: ");
        Number1 = scan.nextInt();

        System.out.println("Digite o seugndo numero: ");
        Number2 = scan.nextInt();

        if (Number1 == Number2) {
            System.out.println("Os números são iguais.");
        } else if (Number1 > Number2){
            System.out.println("O primeiro numero é maior que o segundo!");
        } else {
            System.out.println("O segundo número é maior que o primeiro");
        }
    }

}