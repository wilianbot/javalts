package ArraysTipos;

import java.util.Arrays;

public class ArrayBinarySearch {

    // Retorna um inteiro que inidica em qual posição do array o valor se encontra.
    // Ou retorna um valor negativo caso o valor não seja encontrado.

    public static void main(String[] args) {
        char nota[] = {'C', 'E', 'A', 'D', 'B'};

        Arrays.sort(nota); // Ordena de A a Z
        int posicao = Arrays.binarySearch(nota, 'E'); // Procura em qual posição se encontra a Key
        System.out.println(posicao);
    }
}
