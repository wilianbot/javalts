package Aula8;

public class MetMath {
    int a = -2;

    //obtendo o valorabsoluto de um número
    a = Math.abs(a);
    System.out.println(a);

    //exponenciação
    double d = Math.pow(2, 8);
    System.out.println(d);

    //gerando número ramdomicos
    for (int i = 0; i < 10; i++){
        System.out.println(Math.random());
    }
}
