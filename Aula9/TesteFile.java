package Aula9;
import java.util.Scanner;
import java.io.File;

public class TesteFile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        System.out.println("Entre com um endereço válido de um arquivo: ");
        String caminho = entrada.nextLine();

    }

    public static void lerArquivo(String caminho) {
        File arquivo = new File(caminho);

        if(arquivo.exists()) {
            System.out.println("O caminho especificado existe !\nVamos aos teste:\n");

            if (arquivo.isFile()) {
                System.out.printf("É um arquivo de tamanho %s bytes\n" 
                + "Ultima vez modificado %s\n"
                + "Cujo o caminho é %s\n"
                + "De caminho absoluto %s\n"
                + "E está no diretório pai %s\n"
                + arquivo.length(), arquivo.lastModified(), arquivo.getAbsolutePath(), arquivo.getPath());
            } else {
                System.out.println("É um diretório cujo conteúdo tem os seguintes arquivos: ");
                String[] arquivos = arquivo.list();

                for(String file : arquivos){
                    System.out.println( file );
                }
            }
        }
        else {
            System.out.println("Endereço errado!");
        }
    }
}
