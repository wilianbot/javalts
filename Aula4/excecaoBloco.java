package Aula4;
public class excecaoBloco {
    public static void main(String[] args) {
        int a = 10;
        int[] b = {0, 2, 4, 6,8, 10};

        System.out.println("");
        System.out.println(a/b[0]); // arthmeicExeption
        System.out.println(b[9]); // arrayIndexoutOfBoundsExeption
    }
}
