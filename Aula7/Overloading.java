package Aula7;

/* Overloading (sobrecarregamento) ocorre quando mais de um método com o mesmo nome é 
implementado na mesma classe.

Overloading ou sobrecarga pode se dar apenas pela fireneciação dos argumentos do método.
*/

public class Overloading {

    public void excluir(){
        status  "Codigo " + codigo + " excluido!";
    }
    public void excluir(int codigo){
        status = "Codigo " + codigo + "excluido!";
    }
    
}
