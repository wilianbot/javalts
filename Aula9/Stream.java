package Aula9;
import java.io.*;

/* ============ CLASSES PARA TRATAR COM STREAM ================
 * Classe Reader: Para stream de Entrada de caracteres
 * Classe Writer: Para stream de Saida de caracteres
 * Classe InputStream: Para streams de Entrada de Byte
 * Classe OutputStream: Streams de Saida de Byte são manipulados por sublcasses de 
 * classe OutuputStream.
*/

public class Stream {
    public static void main(String[] args) {
        lerArquivo("c:\\arquivos\\ler.txt");
    }
    public static void lerArquivo (String arquivo) {
        File f = new File(arquivo);
        if (!f.exists()){
            System.out.println("Arquivos: " + arquivo + "Não existe");
            return;
        }
        try {
            //isso representa o fluxo de entrada á partir de um arquivo
            InputStream is = new FileInputStream(arquivo);
            //inputStreamReader é uma clsse para converter os bytes em chars
            InputStreamReader isr = new InputStreamReader(is);
            //BufferedReader é uma classe para armazenar os chars em memoria
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine(); //primeira linha
            while (s != null){
                System.out.println(s);
                s = br.readLine();
            }
        } catch (Exception x) {
            System.out.println(x.getMessage());
        } 
    }
}
