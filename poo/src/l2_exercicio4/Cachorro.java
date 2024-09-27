package l2_exercicio4;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome); // Chama o construtor da classe Animal
    }

    public String late() {
        return this.nome + ": Au Au!";
    }
}
