package AluraJava;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDelancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDelancamento);
        boolean includeNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse = """
                Filme Top Gun
                Filme de aventura.
                Mito
                Ano de lançamento
                """ + anoDelancamento;

        System.out.println(sinopse);

        int classificacao = (int) (media / 2); // casting explicito
        System.out.println(classificacao);


    }
}
