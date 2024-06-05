package Aula9;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteArquivo {
    public static void main(String[] args) {
        int escolha = 0;
        Scanner scan = new Scanner(System.in);
        try {
            File arquivo = new File("arquivo");
            File arquivo2 = new File("arquivo2");

            if (!arquivo.exists()) {
                arquivo.createNewFile();
            } else {
              System.out.println("Arquivo já existe!");  
            }

                System.out.println("================ MENU ================");
                System.out.println("Quer saber o nome do arquivo? [1]");
                System.out.println("Quer saber se pode ser escrito? [2]");
                System.out.println("Quer saber se pode ser lido? [3]");
                System.out.println("Quer saber se é um arquivo? [4]");
                System.out.println("Quer saber a ultima vez modificado? [5]");
                System.out.println("Quer saber o tamanho do arquivo? [6]");
                System.out.println("Quer renomear o arquivo? [7]");
                System.out.println("Quer deletar o arquivo? [8]");
                System.out.print("Digite uma opção: ");
                escolha = scan.nextInt();
                
                switch (escolha) {
                    case 1:
                        System.out.println("Nome do arquvio: " + arquivo.getName());
                        break;
                    case 2:
                        System.out.println("Pode ser escrito: " + arquivo.canWrite());
                        break;
                    case 3:
                        System.out.println("Pode ser lido: " + arquivo.canRead());
                        break;
                    case 4:
                        System.out.println("É um arquivo: " + arquivo.isFile());
                        break;
                    case 5:
                        System.out.println("Ultima vez modificado: " + arquivo.lastModified());
                        break;
                    case 6:
                        System.out.println("Tamanho do arquivo: " + arquivo.length() + " bytes");
                        break;
                    case 7:
                        System.out.println("Renomear o arquivo: " + arquivo.renameTo(arquivo));
                        break;
                    case 8:
                        System.out.println("Arquivo deletado: " + arquivo.delete());
                        break;
                    default:
                        System.out.println("Digite uma opção correta.");
                        break;
                }
        } catch (IOException e) {
            System.out.println("Algo deu errado");
        }
    }
}
