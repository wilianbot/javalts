package Desafios;
import java.util.Scanner;

public class ConversaoTemperatura {
    static class InnerConversaoTemperatura {
        private double celsius, fahre, soma = 0;
        InnerConversaoTemperatura(){
        }

        public void temperatura(){
            Scanner scan = new Scanner(System.in);
            System.out.println("================================");
            System.out.println("Escolha uma das opções:");
            System.out.println("Celsius para Fahrenheit = 1");
            System.out.println("Fahrenheit para Celsius = 2");
            System.out.println("================================");
            int escolha = scan.nextInt();

            if(escolha == 1){
                System.out.println("Digite o Celsius: ");
                celsius = scan.nextDouble();
                soma = (celsius * 1.8) + 32;
                String formattedNumber = String.format("%.2f",soma); 
                System.out.println("A temperatura em Fahrenheit: " + formattedNumber);
            }else if(escolha == 2){
                System.out.println("Digite o Fahrenheit");
                fahre = scan.nextDouble();
                soma = (fahre - 32) / 1.8;
                String formattedNumber = String.format("%.2f",soma); 
                System.out.println("A temperatura em Celsius: " + formattedNumber);
            }else {
                System.out.println("Opçõa inválida! Por favor, escolha entre 1 e 2.");
            }
            scan.close();
        }
    }
    public static void main(String[] args) {
        InnerConversaoTemperatura tem = new InnerConversaoTemperatura();
        tem.temperatura();
    }
}
