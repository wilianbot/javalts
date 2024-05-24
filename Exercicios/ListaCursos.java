package Exercicios;

import java.util.Arrays;

public class ListaCursos {
    static class InnerListaCursos {
        private String vetor[] = {"JSE", "JEE", "JME", "EJB", "JSTL", "JSF", "JSP"};
        InnerListaCursos(){
        }

        public void Cursos(){
            Arrays.sort(vetor);
            for(int i = 0; i < vetor.length; i++){
                System.out.println(vetor[i]);
            }
        }
        

        public static void main(String[] args) {
            InnerListaCursos cur = new InnerListaCursos();
            cur.Cursos();
        }
    }
}
