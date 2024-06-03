package Aula7;

// A palabra chave this referencia a propria classe, quando utilizado de dentro da própria classe.
// A palavra-chave `this()` em Java é usada para chamar um construtor dentro de outro construtor na mesma classe.

public class ReferenciandoAtributosThis {
    public void imprimir(){
        System.out.println(status);
    }

    public void imprimir (String status) {
        System.out.println(status);
        System.out.println(this.status);
    }

    // OBS: A palavra this não pode ser usada em métodos estáticos.
}
