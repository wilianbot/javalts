package colecoes;
import java.util.*;

public class treemap {

    // Classe TreeMap oferece a funcionalidade adicional de associar uma ordem aos elementos da coleção
    public static void main(String[] args) {
        HashMap mapa = new HashMap(); // Permite o mapa funcionar implementando o mapeamento basico
        mapa.put("Curso 1", "JSE"); // Adiciona um novo elemento na coleção
        mapa.put("Curso 2", "JME");
        mapa.put("Curso 3", "J2EE");
        mapa.put("Curso 4", "EJB");

        Iterator i = mapa.keySet().iterator(); // um objeto permite interagir com as coleções
        while (i.hasNext()) {
            String chave = (String)i.next();
            String curso = (String)mapa.get(chave);
            System.out.println(chave + ':' + curso);
        }

        System.out.println("=========EM ORDEM===========");

        TreeMap treeMap = new TreeMap(mapa); // Ordena em sequencia logica a coleção
        Iterator t = treeMap.keySet().iterator(); // um objetos permite interagir com as coleções 

        while (t.hasNext()) { // Retorna True se houver mais elementos na coleção
            String chave = (String)t.next(); // Vai para o proximo elemento
            String curso = (String)mapa.get(chave); //  Pega o valor da chave
            System.out.println(chave + ":" + curso);
        }

        String curso = (String) mapa.get("Curso 3");
        System.out.println(curso);
    }
}
