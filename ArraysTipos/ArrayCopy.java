package ArraysTipos;

public class ArrayCopy {
    
    public static void main(String[] args) {

        // Metodo arraycopy para copiar elementos de um Array para Outro.
        // Sintaxe: arraycopy (origem, indiceorigem, destino, indice destino, quantidade)

        int [] a = {2, 5, 4, 5, 9};
        int [] b = {3, 8, 30, 50, 30};
        
        System.arraycopy(a, 0, b, 0, 5);

        for(int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }
    }
}
