package Aula8;

public class Thread {
    private String mensagem = "Olá, Mundo!";

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void run() {
        for(int x = 0; x < 10000; x++) {
            String s = mensagem + " " + x;
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Thread th = new Thread();
        th.run();
    }
}
