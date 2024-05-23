package Exercicios;

class Estoque {
    public int estoque = 270;
    private int utiliMes = 30;
    private int calculoMes = 0;
    
    public Estoque() {
    }
    public void product(){
        this.calculoMes = this.estoque / this.utiliMes;

        System.out.println("Faltam " + this.calculoMes + " Meses para acabar o estoque");
    }

    public static void main(String[] args) {
        Estoque v22 = new Estoque();
        v22.product();
    }
}