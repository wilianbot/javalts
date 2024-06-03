package Aula8;

public class byte1 {
    
    public static void main(String[] args) {
        // obtendo o maior e menor valor
        byte maior = Byte.MAX_VALUE;
        byte menor = Byte.MIN_VALUE;
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        String s = "123";
        byte b = 0;
        // convertendo string para byte
        b = Byte.parseByte(s);
        // convertendo byte para string
        s = Byte.toString(b);
    }
}
