package AluraJava;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota  = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota " + i);
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        leitura.close();

        System.out.println("Média de avaliações " + mediaAvaliacao / 3);
    }
}
