package Aula5.Array;

import java.util.Arrays;

public class ArraysEquals {

    // Verifica se os Arrays tem o mesmo conteudo nas mesma ordem.
    // Equals

    public static void main(String[] args) {
        char n1[] = {'C', 'D', 'A', 'J'};
        char n2[] = {'C', 'D', 'A', 'J'};

        if(Arrays.equals(n1, n2)) {
            System.out.println("Os Arrays são Iguais");
        } else {
            System.out.println("Os Arrays São Diferentes");
        }
    }
}
