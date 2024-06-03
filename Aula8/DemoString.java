package Aula8;

public class DemoString {
    String dominio = "www.chapeco.com.br";

    //Obtendo a posição de um caracter ou string dentro da string
    int posicao = dominio.indexOf("chapeco");
    System.out.println(posicao); // 4
 
    //Obtendo o tamanho da string
    int tamanho = dominio.length();
    System.out.println(tamanho); // 18

    // Substituindo caracteres na string
    String dominioAlterado = dominio.replace(".", "=");
    Ssytem.out.println(dominioAlterado); // www=chapeco=com=br

    // Obtendo uma parte da String
    String parteDominio = dominio.substring(4, 11);
    System.out.println(parteDominio); // chapeco

    // Obtendo uma parte da String
    String parteDominio2 = dominio.substring(4);
    System.out.println(parteDominio2); // chapeco.com.br

    // Convertendo String para maicula 
    String dominioMaicula = dominio.toUpperCase();
    System.out.println(dominioMaicula); // WWW.CHAPECO.COM.BR

    // Convertendo String para minuscula
    String dominioMinuscula = dominio.toLowerCase();
    System.out.println(dominioMinuscula); // www.chapeco.com.br
}
