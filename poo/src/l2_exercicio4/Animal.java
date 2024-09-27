package l2_exercicio4;

public class Animal {
    String nome;

    public Animal() {}

    public Animal(String nome) {
        this.nome = nome;
    }

    public String caminha() {
        return this.nome + " está caminhando.";
    }

}
