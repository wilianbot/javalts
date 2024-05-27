package Aula6;

import java.sql.ResultSet;

public class Metodos {
    public void alterarCliente() {
        // Instruções para alterar o cliente
    }
    public int obterNumeroClientes() {
        int numeroClientes = 0;
        //instruções para obter o numero de clientes
        return numeroClientes;
    }
    public int obterNumeroClientes(int situacao) {
        int numeroClientes = 0;
        //instruções para obter o numero de clientes ativos ou inativos
        return numeroClientes;
    }
    public ResultSet listarClientes() {
        ResultSet rs = null;
        // instruções para obter uma lisata de clientes
        return rs;
    }

    public static void main(String[] args) {
        Metodos m = new Metodos();
        m.alterarCliente();
        m.obterNumeroClientes();
        
    }
}
