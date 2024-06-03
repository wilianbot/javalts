package Exercicios;

public class DiasAleatorio {
    static class InnerDiasAleatorio {
        private int NumberAleatorio;
        InnerDiasAleatorio(){};

        public void GerarDiaSemana(){
            NumberAleatorio = (int) (Math.random() * 7);
            switch (NumberAleatorio) {
                case 0:
                    System.out.println("Segunda-feira");
                    break;
                case 1:
                    System.out.println("Terça-feira");
                    break;
                case 2:
                    System.out.println("Quarta-feira");
                    break;
                case 3:
                    System.out.println("Quinta-feira");
                    break;
                case 4:
                    System.out.println("Sexta-feira");
                    break;
                case 5:
                    System.out.println("Sabado");
                    break;
                case 6:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Numero invalido!");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        InnerDiasAleatorio Dias = new InnerDiasAleatorio();
        for(int i = 0; i < 10; i++){
            Dias.GerarDiaSemana();
        }
    }
}
