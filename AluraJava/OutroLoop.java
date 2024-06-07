package AluraJava;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        int i = 0;
        while (nota != -1) {
            System.out.println("Digite a nota " + i);
            nota = leitura.nextDouble();
            
            if (nota != -1) {
                mediaAvaliacao += nota;
                i++;
            }
        }
        
        leitura.close();

        System.out.println("Média de avaliações " + mediaAvaliacao / i);
    }
}
