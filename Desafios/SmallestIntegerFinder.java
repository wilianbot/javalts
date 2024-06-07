package Desafios;
public class SmallestIntegerFinder {

  static class MenorNumero {
    int[] vetor;
    int menor;

    MenorNumero(int[] vetor){
      this.vetor = vetor;
      this.menor = vetor[0];
    }

    MenorNumero() {
    }

    public void verificador(){
      for(int i = 0; i < vetor.length; i++){
      if(vetor[i] < menor)
        menor = vetor[i];
      }
      System.out.println(menor);
    }
  }

  public static void main(String[] args) {
    int[] vetorEntrada = { 4, 5, 1, 6, 8, 9, -50};
    MenorNumero not = new MenorNumero(vetorEntrada);
    not.verificador();
  }
}
