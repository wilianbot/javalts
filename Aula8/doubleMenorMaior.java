package Aula8;

public class doubleMenorMaior {
    
    public static void main(String[] args) {
    // Obtendo o maior e menor valor
    double maior = Double.MAX_VALUE;
    double menor = Double.MIN_VALUE;
    System.out.println("Maior valor: " +maior);
    System.out.println("Menor valor: " +menor);

    String s = "123";
    double b = 0;
    //convertendo string para double
    b = Double.parseDouble(s);
    //convertendo souble para string
    s = Double.toString(b);    
    }
}
