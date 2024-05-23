package ArraysTipos;

public class ArrayCopy {
    
    public static void main(String[] args) {

        // Metodo arraycopy para copiar elementos de um Array para Outro.
        // Sintaxe: arraycopy (origem, indiceorigem, destino, indice destino, quantidade)

        int [] a = {2, 5, 4, 5};
        int [] b = {2, 5, 30, 50, 30};
        
        System.arraycopy(a, 0, b, 2, 3);

        for(int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }
    }
}
