package Aula5.Array;

import java.util.Arrays;

public class ArraysSort {   

    // Organiza os elementos de forma A a Z 
    // Sort
    
    public static void main(String[] args) {
        char nota[] = {'C', 'E', 'A', 'D', 'B'};
        
        for (int i = 0; i < nota.length; i++){
            System.out.println(nota[i]);
        }
        Arrays.sort(nota);
        System.out.println("\n");

        for(int i =0; i < nota.length; i++){
            System.out.println(nota[i]);
        }
    }
}
