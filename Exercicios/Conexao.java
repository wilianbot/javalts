package Exercicios;

public abstract class Conexao {
    private String status;
    public Conexao(){}

    public void setStatus(String status){
        this.status = status;
    }

    public void conectar(){
        System.out.println("Olá, Mundo!");
    }

    public void desconectar(){

    }

    public abstract void alterar();

    public abstract void excluir();

    public abstract void incluir();

}
