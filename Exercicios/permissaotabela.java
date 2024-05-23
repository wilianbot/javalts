package Exercicios;


public class permissaotabela {
    int operacoes = 0;

    operacoes = operacoes | INCLUIR;

    if ((operacoes & INCLUIR) == INCLUIR) {
         System.out.println("Permissão para incluir");
    } else {
        System.out.println("Sem permissão para incluir");
    }
}
