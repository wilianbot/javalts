package Aula9;
import java.io.IOException;
import java.io.BufferedReader;

public class readerTeste {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("arquivo.txt");
        BufferedReader bufferedReader = new BufferedReader(reader)) {
            int caractere;
            while ((caractere = bufferedReader.read()) != -1) {
                System.out.println((char) caractere);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
