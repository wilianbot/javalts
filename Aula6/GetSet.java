package Aula6;

public class GetSet {
    /**
     * Veiculo
     */
    static class Veiculo {
        Veiculo(){
        }
        private String color;

        // Getter
        public String getColor() {
            return color;
        }

        // Setter
        public void setColor(String c) {
            this.color = c;
        }
    }
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        v1.setColor("Vermelho");
        System.out.println(v1.getColor());
    }
}
