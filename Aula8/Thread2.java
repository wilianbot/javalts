package Aula8;

public class Thread2 {
    public static void main(String[] args) {
        DemoThread x = new DemoThread();
        DemoThread y = new DemoThread();

        x.setMensagem("x: ");
        y.setMensagem("y: ");

        y.start();
        x.start();
    }
}
