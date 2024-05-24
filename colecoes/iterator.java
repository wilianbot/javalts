package colecoes;
import java.util.*;

public class iterator {
    public static void main(String[] args) {
        // É um objeto que permite interagir com coleções.
        // Metodo hasNext retorna true se houver mais elementos na coleção.
        // Metodo next retorna o próximo elemento.

        HashMap mapa = new HashMap(); // Implementa o mecanismo basico de mapeamento para funcionar o mapa
        mapa.put("Curso 1", "JSE"); // mapa.put coloca um novo elemento no mapa
        mapa.put("Curso 2", "JME"); // mapa.put coloca um novo elemento no mapa
        mapa.put("Curso 3", "J2EE"); // mapa.put coloca um novo elemento no mapa
        mapa.put("Curso 5", "EJB"); // mapa.put coloca um novo elemento no mapa

        String curso = (String)mapa.get("Curso 2"); // mapa.get pega o valor da chave informada
        System.out.println(curso);

        int elementos = mapa.size(); // mapa.size informa a quantidade de elementos
        System.out.println("Elementos: " + elementos); 

        Iterator i = mapa.keySet().iterator(); // Um objeto permite interagir com coleções, associando á coleção um mecamismo para percorrer seu conteudo.
        while (i.hasNext()) { // hasNext retorna true se houver mais elementos na coleção, (Enquanto houver elementos continuara)
            String chave = (String)i.next(); // metodo next retorna o próximo elemento
            curso = (String)mapa.get(chave);
            System.out.println(chave);
            System.out.println(chave + ":" + curso);
        }

        mapa.clear();
        elementos = mapa.size();
        System.out.println("Elementos: " + elementos);

    }
}
