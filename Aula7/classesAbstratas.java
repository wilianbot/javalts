package Aula7;

// Uma classe abstrata é uma classe que não pode ser instanciada
// Serve como base para outras classes


// # para transformar uma classe em abstrata basta somente colocar o nome abstract antes do nome da classe

public abstract class classesAbstratas {
        protected String status;
        protected int codigo = 0;
        protected String nome = "";
        public  void setCodigo(int codigo) {
            this.codigo = codigo;
        }
        public int getCodigo() {
            return this.codigo;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getNome() {
            return this.status;
        } 
        public String getStatus() {
            return this.status;
        }
        public void excluir() {
            status = "codigo " + codigo + " excluido!";
        }

        public static void main(String[] args) {
            
        }
}
