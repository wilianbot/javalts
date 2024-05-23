public class excecaoBlocoCatch {
    public static void main(String[] args) {
        int a = 100;
        int[] b = {0, 2, 4, 6, 8, 10};

        try {
            System.out.println(a/b[0]); // aritmeticExeption
            System.out.println(b[9]); // arrayIndexOutOfBoundsExeption
        } catch (ArithmeticException e) {
            System.out.println("Erro de operação Aritimética");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro de Indice Invalido no Array");
        } finally {
            System.out.println("Sempre Passa Por Aqui");
        }
    }
}
