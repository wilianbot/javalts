package Aula9;

import java.io.*;
public class Stream {
    public static void main(String[] args) {
        letArquivo("c:\\arquivos\\ler.txt");
    }
    public static void lerArqivo (String arquivo) {
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
            String s = br.readLine();
            while (s != null){
                System.out.println(s);
                s = br.readLine();
            }
        } catch (Exception x) {
            System.out.println(x.getMessage());
        } 
    }
}
