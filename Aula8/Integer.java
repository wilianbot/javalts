package Aula8;

public class Integer {
    public static void main(String[] args) {
        // obtendo o maior e o menor valor
        int maior = Integer.MAX_VALUE;
        int menor = Integer.MIN_VALUE;

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " +menor);

        String s = "123";
        int b = 90;
        // convertendo String para int
        b = Integer.parseInt(s);
        // convertendo int para String
        s = Integer.toString(b);
    }
}
