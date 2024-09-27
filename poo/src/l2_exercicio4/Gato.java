package l2_exercicio4;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome); // Chama o construtor da classe Animal
    }

    public String mia() {
        return this.nome + ": Miaaaaaaau!";
    }
}
