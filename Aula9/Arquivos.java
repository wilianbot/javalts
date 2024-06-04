package Aula9;
import java.io.*;

/*================CLASSES PARA TRATAR STREAMS DE ARQUIVOS===================
 * FilReader: Utilizada para a leitura de caracteres de um arquivo.
 * FileWriter: Utilizada para a escrita de caracteres em m arquivo.
 * FileInputStream: Utilizada para serializar um objeto.
 * FileOutputStream: Utilizada para deserializar um objeto.
 */

public class Arquivos {
    public static void main(String[] args) {
        copiarArquivo();
    }

    public static void copiarArquivo() {
        //lendo linhas
        try {
            FileReader i = new FileReader("c: \\arquivos\\ler.txt");
            FileWriter o =  new FileWriter("c: \\arquivos\\Gravar.txt");
            BufferedReader in = new BufferedReader(i);
            PrintWriter out = new PrintWriter(o);
            String Linha;
            while ((Linha = in.readLine()) != null) {
                System.out.println(Linha);
                out.println(Linha);
            }
            out.flush();
            i.close();
            o.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
