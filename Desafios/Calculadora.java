package Desafios;
import java.util.Scanner;

public class Calculadora {
    static class InnerCalculadora {
        private float soma = 0;
        private int num1, num2 = 0;
        private String operacao;

        InnerCalculadora() {
        }

        public void Calculo() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o Primeiro numero: ");
            num1 = scan.nextInt();
            System.out.println("Digite o Segundo numero: ");
            num2 = scan.nextInt();
            scan.nextLine();

            System.out.println("=========================");
            System.out.println("=        + - / * %      =");
            System.out.println("=========================");
            System.out.println("Digite a operação Desejada: ");
            operacao = scan.nextLine();

            switch (operacao) {
                case "+":
                    soma = num1 + num2;
                    break;
                case "-":
                    soma = num1 - num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Operação invalida");
                        return;
                    }else {
                        soma = (float) num1 / num2;
                    }
                    break;
                case "*":
                    soma = num1 * num2;
                    break;
                case "%":
                    soma = num1 % num2;
                    break;
                default:
                System.out.println("Operação Invalida");
                    return;
            }

            System.out.println("Soma entre " + num1 + operacao + num2 + " : " + soma);

            scan.close();
        }
    }

    public static void main(String[] args) {
        InnerCalculadora cal = new InnerCalculadora();
        cal.Calculo();
    }
}
