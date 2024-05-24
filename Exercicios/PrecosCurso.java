package Exercicios;
import java.util.*;

import colecoes.iterator;
import colecoes.treemap;

public class PrecosCurso {
    static class InnerPrecosCurso {
        public InnerPrecosCurso(){
            TreeMap<String, Integer> mapa = new TreeMap<String, Integer>();
         
            mapa.put("JSE", 190);
            mapa.put("JEE", 380);
            mapa.put("JME", 280);
            mapa.put("EJB", 240);
            mapa.put("JSTL", 90);
            mapa.put("JSF", 170);
            mapa.put("JSP", 120);


            Iterator i = mapa.keySet().iterator();

            while (i.hasNext()){
                String key = (String) i.next();
                Integer course = (Integer) mapa.get(key);

                System.out.println(key + " : " + course);
            }     

            System.out.println("=============EM ORDEM============");
            
            TreeMap treeMap = new TreeMap(mapa); 
            Iterator t = treeMap.keySet().iterator();

            while (t.hasNext()){
                String key = (String) t.next();
                Integer course = (Integer) mapa.get(key);

                System.out.println(key + " : " + course);
            }
        } 
    }
    public static void main(String[] args) {
        InnerPrecosCurso pre = new InnerPrecosCurso();
    }
}   
