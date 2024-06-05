package Aula6;

public class TestePropriedade {
    class Pessoa {
        private String nome;

        public String getNome() {
            return nome;
        }

        public void setNome(String novoNome) {
            if (novoNome != null && !novoNome.isEmpty()){
                this.nome = novoNome;
            } else {
                throw new IllegalArgumentException("Nome invalido fornecido");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println();
    }
}
