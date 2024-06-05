package Aula5.Array;
import java.util.Arrays;

public class ArraysFill {

    // Preenche o Array com valor recebido como parametro.
    // Fill

    public static void main(String[] args) {
        String nota[] = new String[10];
        Arrays.fill(nota, "A"); // O tipo de valor deve ser conpativel com o tipo do array.

        for(int i = 0; i < nota.length; i++){
            System.out.println(nota[i]);
        }
    }
}
