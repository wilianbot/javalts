package Aula7;

// As interfaces atuam como um contrato para as classes que a implementam.
// Nas interfaces você define os métodos que deverão ser implementados por classes derivadas.
// As classes que implementam estas interfaves devem oferecer uma implementação para cada método definido na sa itnerface.
// As classes podem implementar mais de uma interface. 

public interface Veiculo {
    public String placa = "";
    public float velMax = 0;
    public void iniciar();
    public void parar();
    default void buzinar(){
      System.out.println("Buzinando");
   }
}



