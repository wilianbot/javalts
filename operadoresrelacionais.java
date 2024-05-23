public class operadoresrelacionais {
    public static void main(String[] args) {
        int afirmacao1 = 0;
        int afirmacao2 = 0;
        afirmacao1 = 10;
        afirmacao2 = 5;
        System.out.println(afirmacao1 > afirmacao2); //imprime true

        afirmacao1 = 10;
        afirmacao2 = 10;
        System.out.println(afirmacao1 >= afirmacao2); //imprime true

        afirmacao1 = 5;
        afirmacao2 = 10;
        System.out.println(afirmacao1 < afirmacao2); //imprime true

        afirmacao1 = 5;
        afirmacao2 = 5;
        System.out.println(afirmacao1 == afirmacao2); //imprime true        
    }
}
