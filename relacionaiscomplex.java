public class relacionaiscomplex {
    public static void main(String[] args) {
        boolean afirmacao1 = true;
        boolean afirmacao2 = true;

        System.out.println(afirmacao1 && afirmacao2); // imprime true

        afirmacao1 = true;
        afirmacao2 = false;
        System.out.println(afirmacao1 && afirmacao2); // imprime false

        afirmacao1 = true;
        afirmacao2 = false;
        System.out.println(afirmacao1 || afirmacao2); // imprime true

        afirmacao1 = false;
        System.out.println(!afirmacao1); // imprime true         
    }
}
