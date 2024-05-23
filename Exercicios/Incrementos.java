package Exercicios;

public class Incrementos {
    public static void main(String[] args) {
        int a = 10; int b = 20; int r = 0;

        r = a++ + ++b; // 31
        r = a + b; // 30
        r = ++a + -b; // -9
    }
}
