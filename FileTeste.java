import java.io.File;
import java.io.IOException;

public class FileTeste {
    public static void main(String[] args) {
        try {
            // Criação de um novo arquivo
            File arquivo = new File("exemplo.txt");
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado: " + arquivo.getName());
            } else {
                System.out.println("Arquivo já existe.");
            }

            // Verificando propriedades do arquivo
            if (arquivo.exists()) {
                System.out.println("Nome do arquivo: " + arquivo.getName());
                System.out.println("Caminhodo arquivo: " + arquivo.getPath());
                System.out.println("Pode ser lido: " + arquivo.canRead());
                System.out.println("Pode ser escrito: " + arquivo.canWrite());
                System.out.println("Tamanho do arquivo: " + arquivo.length() + " bytes");
            }

            // Deletando o arquivo
            if (arquivo.delete()) {
                System.out.println("Arquivo deletado: " + arquivo.getName());
            } else {
                System.out.println("Falha ao deletar o arquivo.");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    } 
}
