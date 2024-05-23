package Exercicios;

class Estoque2 {
    public int estoque = 270;
    private int consumoMensal = 30;
    private int usoMensal = 0;

    public Estoque2() {
    }

    public void produto(){
        this.usoMensal = this.estoque / this.consumoMensal;
        
        System.out.println("Restam " + usoMensal + " Meses para acabar o estoque");
    }

    public static void main(String[] args) {
        Estoque2 v22 = new Estoque2();
        v22.produto();
    }
}
