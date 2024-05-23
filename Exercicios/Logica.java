package Exercicios;

public class Logica {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        boolean r = false;

        r = a > b; // false
        r = a++ > --b; // false
        a = 10; 
        b = 15;
        r = (a>10) || (b>10); // true
        r = (a>10) && (b>10); // false
    }
}
