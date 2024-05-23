public class trycatchfinally {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
        catch(Exception e) {
            System.out.println("\nO Erro foi " + e);
        }
        finally {
            System.out.println("Fim");
        }
    }
}
