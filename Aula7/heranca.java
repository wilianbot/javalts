package Aula7;;

public class heranca {
    public static void main(String[] args) {
    }

    // Variaveis protegidas
    protected String status;
    protected int codigo = 0;
    protected String nome = "";

    // Metodos de acesso
    public void setCodigo (int codigo){
        this.codigo = codigo;
    }
    public int getCodigo() {
        return this.codigo;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    // Metodos
    public void excluir(){
        status = "Codigo " + codigo + " excluido!";
    }
}
