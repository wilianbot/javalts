package Aula6;

import Aula6.metodosEstaticos.Conexao;

public class metodoscriados {
    
    public static void main(String[] args) {
        Clientes c = new Clientes();
        // exmplo chamada a um método sem retorno
        c.alterarClientes();

        //exemplo chamada a um método com retorno
        int numero = 0;
        numero = c.obterNumeroClientes();

        //exemplo chamada a um método com retorno e parâmetros
        numero = c.obterNumeroClientes(1);

        //exemplo chamada a um método estático
        Conexao.obterConexao();

    }
}
