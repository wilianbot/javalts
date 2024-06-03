package Exercicios;

import Aula8.boolean1;

public class EmailExercicios {
    static class Email{
        Email(){};
        private int posicao = 0;
        private String email = "wilianrobal@gmail.com";

        public void validarEmail(){
            posicao = email.indexOf("@");
            boolean emailValido = posicao == -1; 

            if(emailValido){
                System.out.println("Favor digitar um email correto. (faltando: @)");
            } else {
                System.out.println("Email correto!");
            }
        }

        public void obterNome(){
            String parteNome = email.substring(0, posicao);
            System.out.println("Nome antes do arroba: " + parteNome);
        }
    }

    public static void main(String[] args) {
        Email em = new Email();
        em.validarEmail();
        em.obterNome();

    }
}
