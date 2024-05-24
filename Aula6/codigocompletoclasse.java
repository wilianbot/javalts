package Aula6;

public class codigocompletoclasse {
    // Atributos tipo propriedade
    private int codigo = 0;

    private String nome = "";

    private boolean ativo = false;

    public void setCodigo (int codigo){
        this.codigo = codigo;
    }
    public int getCodigo () {
        return this.codigo;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public String getNome () {
        return this.nome;
    }
    public void setAtivo (boolean ativo) {
        this.ativo = ativo;
    }
    public boolean getAtivo () {
        return this.ativo;
    }
}
