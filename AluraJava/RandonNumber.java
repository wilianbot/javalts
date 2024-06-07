package AluraJava;

import java.util.Random;
import java.util.Scanner;

public class RandonNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Randon = new Random().nextInt(100); 
        int Number = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Adivinhe o numero aleatorio: ");
            Number = scan.nextInt();

            if (Number == Randon) {
                System.out.println("Parabens você acertou o numero aleatorio!");
                break;
            } else if(Number < Randon){
                System.out.println("O numero aleatorio é maior!");
            } else {
                System.out.println("O numero aleatorio é menor!");
            }
        }
    }
}
