package Aula6;

public class propriedades {
    static class Innerpropriedades {
        private int codigo = 0;
        private String nome;
        private boolean ativo;

        public Innerpropriedades(){
        }
        public void setCodigo(int prcodigo){
            this.codigo = prcodigo;
        }
        public void setNome(String prnome){
            this.nome = prnome;
        }
        public void setAtivo(boolean prativo){
            this.ativo = prativo;
        }
        public int getCodigo() {
            return(this.codigo);
        }
        public String getNome() {
            return(this.nome);
        }
        public boolean getAtivo() {
            return(this.ativo);
        }
    }

    public static void main(String[] args) {
        Innerpropriedades c = new Innerpropriedades();
        // Atribuindo valores as propriedades
        c.setCodigo(1000);
        c.setNome("Java");
        c.setAtivo(true);

        // Mostrando valores das propriedades
        System.out.println(c.getCodigo());
        System.out.println(c.getNome());
        System.out.println(c.getAtivo());
    }
}
