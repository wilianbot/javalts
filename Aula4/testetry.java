package Aula4;

public class testetry {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            int[] array2 = {3, 4, 5, 6, 8};
            int x = 10/2;
            System.out.println(array[4]);
            System.out.println(array2.length);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indice Fora dos limites do Array " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Erro" + e.getMessage());
        }
    }
}
