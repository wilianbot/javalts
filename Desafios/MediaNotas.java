package Desafios;
import java.util.Scanner;

public class MediaNotas {
    static class InnerMediaNotas {
        private int nota1, nota2, nota3 = 0;
        private float media = 0;
        InnerMediaNotas(){
        }

        public void Media(){    
            Scanner scan =  new Scanner(System.in);
            System.out.println("Digite a primeira nota (0-10): ");
            nota1 = scan.nextInt();
            System.out.println("Digite a segunda nota (0-10): ");
            nota2 = scan.nextInt();
            System.out.println("Digite a terceira nota (0-10): ");
            nota3 = scan.nextInt();

            if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10){
                System.out.println("Notas invalidas! Todas as notas devem estar entre 0 e 10.");
                scan.close();
                return;
            }

            media = (nota1 + nota2 + nota3) / 3.0f;

            if(media < 5){
                System.out.println("Aluno reprovado!");
            }else if(media < 7){
                System.out.println("Alno em recuperação!");
            }else {
                System.out.println("Aluno aprovado!");
            }

            System.out.println("A media do aluno é: " + media);
            scan.close();
        }
    }
    
    public static void main(String[] args) {
        InnerMediaNotas cal = new InnerMediaNotas();
        cal.Media();
    }
}
