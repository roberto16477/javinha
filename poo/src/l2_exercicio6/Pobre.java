package l2_exercicio6;

public class Pobre extends Pessoa {
    public Pobre(String nome, int idade) {
        super(nome, idade);
    }

    public void trabalha() {
        System.out.println(this.nome + " está trabalhando.");
    }
}
