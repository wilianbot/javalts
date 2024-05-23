public class trycatch {
    public static void main(String[] args) {
        try {
            int x = 10/0;
            System.out.println("Divisão é " + x);
        }
        catch(Exception e) {
            System.out.println("\n" + e.getMessage());
        }
    }
}
