package AluraJava;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); 
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDelancamento = leitura.nextInt();
        System.out.println("Diga a sua avalição para o filme ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme + anoDelancamento + avaliacao);
    }
}
