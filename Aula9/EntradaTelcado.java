package Aula9;
import java.io.*;

public class EntradaTelcado {
    public static void main(String[] args) {
        digitarTeclado();
    }
    
    public static void digitarTeclado(){
        String linha;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);
        System.out.println("Digite algo e tecle enter");
        try {
            linha = in.readLine();
            System.out.println("Linha: " + linha);
            in.close();
        } catch (Exception e) {
            e.getMessage();
        } finally {
            System.out.println("Utilizando finally sempre passa aqui.");
        }
    }
}
