package AluraJava;

public class Condicional {
    public static void main(String[] args) {
        int anoDelancamento = 1989;
        boolean includeNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if(anoDelancamento > 2000){
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if(includeNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else {
            System.out.println("Deve pagar a locação");
        }
    }
}
