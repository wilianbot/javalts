package Aula9;
import java.io.File;
import java.io.IOException;

public class TesteDiretorio {
    public static void main(String[] args) {
        try {
            File diretorio = new File("novo_diretorio");

            boolean sucesso = diretorio.mkdir();

            if (sucesso) {
                System.out.println("Diretorio criado com sucesso!");
            }else {
                System.out.println("Falha ao criar diretorio.");
            }
        } catch (I0Exception e) {
            System.out.println("Algo deu errado!" + e.getMessage());
        }
    }
}
