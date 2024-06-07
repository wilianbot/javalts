package AluraJava;

import java.util.Scanner;

public class NumberPoNe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Number = 0;

        System.out.println("Digite um número: ");
        Number = scan.nextInt();
        if (Number > 0) {
            System.out.println(Number);
            System.out.println("Numero Positivo!");
        } else {
            System.out.println(Number);
            System.out.println("Numero Negativo!");
        }
    }
}
