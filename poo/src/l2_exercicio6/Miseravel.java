package l2_exercicio6;

public class Miseravel extends Pessoa{
    public Miseravel(String nome, int idade) {
        super(nome, idade);
    }

    public void mendiga() {
        System.out.println(this.nome + " está mendigando.");
    }
}
