public class temp2 {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice Fora dos Limites Array");
        }
    }
}
