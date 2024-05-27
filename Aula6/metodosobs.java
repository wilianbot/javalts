package Aula6;

import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

public class metodosobs {
    // atributos tipo propriedades
    private int codigo = 0;
    private String nome = "";
    private boolean ativo = false;
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo() {
        return this.codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    public boolean getAtivo() {
        return this.ativo;
    }
    public void alterarCliente() {
        // Instrução para alterar o cliente
    }
    public int obterNumeroClientes() {
        int numeroClientes = 0;
        // Instrução para obter o número de clientes
        return numeroClientes;
    }
    public int obterNumeroClientes(int situacao) {
        int numeroClientes = 0;
        return numeroClientes;
    }
    public ResultSet listarClientes() {
        ResultSet rs = null;
        return rs;
    }
}
