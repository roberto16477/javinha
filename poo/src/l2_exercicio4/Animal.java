package l2_exercicio4;

public class Animal {
    String nome;
    String raca;

    // Construtor padrão
    public Animal() {}

    // Construtor com nome
    public Animal(String nome) {
        this.nome = nome;
    }

    // Método para caminhar
    public String caminha() {
        return this.nome + " está caminhando.";
    }

}
