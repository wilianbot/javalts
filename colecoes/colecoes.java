package colecoes;

import java.util.*;

public class colecoes {
    public static void main(String[] args) {
        HashMap mapa = new HashMap();
        // Coleções é uma estrtura de dados que permite armazenas desde simples tipos primitivos até objetos mais complexos.
        // Coleção tambem é um objeto.

        // Operações 
        // Incluir, remover, Consultar

 

        // METODOS 

        // Put
        // Sintaxe: put(Object key, Object value)
        // Associa m novo valor associado á chave especificada
        mapa.put("Curso 1", "JSE");
        mapa.put("Curso 3", "JME");
        mapa.put("Curso 2", "J2EE");

        // Get
        // Sintaxe: get(Object key)
        // Retorna o valor associado á chave especificada
        String curso = (String) mapa.get("Curso 3");
        System.out.println(curso);

        // Size
        // Sintaxa: size()
        // Retorna a quantidade de elementos na coleção
        int elementos = mapa.size();
        System.out.println("elementos" + elementos);

        // Remove
        // Sintaxa: remove(Object key)
        // Remove uma chave da coleção
        mapa.remove("Curso 4");
    }
}
