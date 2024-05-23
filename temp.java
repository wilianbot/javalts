public class temp {
    public static void main(String[] args) {
        int x[] = {5, 15,25, 35, 45};

        // Modo Convenvional
        System.out.println("Modo Convencional:");
        for(int i = 0; i < x.length; i++){
            System.out.println("Valor de X: " + x[i]);
        }

        System.out.println("\n");

        // Modo Elegante
        System.out.println("Modo Elegante");
        for(int elemento:x) {
            System.out.println("Valor de X: " + elemento);
        }
    }
}
