package ArraysTipos;
public class DeclararArray {
    public static void main(String[] args) {
        // char nota[];

        // nota = new char[5];

        char nota[] = new char[5];

        nota[0] = 'A';
        nota[1] = 'B';
        nota[2] = 'C';
        nota[3] = 'D';
        nota[4] = 'E';

        String cursos[] = {"J434", "DFD3", "DFDF"};

        int elemento = nota.length;
        System.out.println("Elementos: " + elemento);

        for(int i = 0; i < nota.length; i++){
            System.out.println(nota[i]);
        }

    }
}
