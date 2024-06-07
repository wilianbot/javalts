package AluraJava;

import java.util.Scanner;

public class ContaBancaria {
    private int escolha = 0;
    private String nome = "Wilian Robal";
    private String tipoConta = "Corrente";
    private double saldo = 3000.00;
    private double transferir = 0;

    Scanner scan = new Scanner(System.in);

    public void Extrato() {
        System.out.println("******************************************");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("******************************************");
    }

    public void Menu() {
        while (true) {
            System.out.println("\n");
            System.out.println("Operações");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println("");
            System.out.println("Digite a opção desejada:");
            escolha = scan.nextInt();
            
            if (escolha == 4) {
                System.out.println("Encerrando o programa...");
                break;
            }
            Operacoes();
        }
    }

    public void Operacoes() {
        switch (escolha) {
            case 1:
                System.out.println("O saldo atual é R$ " + saldo);
                break;
            case 2:
                System.out.println("Informe o valor a receber: ");
                saldo += scan.nextDouble();
                System.out.println("Saldo atualizado R$ " + saldo);
                break;
            case 3:
                System.out.println("Informe o valor que deseja transferir: ");
                transferir = scan.nextDouble();
                if (saldo >= transferir) {
                    saldo -= transferir;
                    System.out.println("Saldo atualizado R$ " + saldo);
                } else {
                    System.out.println("Saldo insuficiente para transferencia!");
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    public static void main(String[] args) {
        ContaBancaria con = new ContaBancaria();
        con.Extrato();
        con.Menu();
    }
}
