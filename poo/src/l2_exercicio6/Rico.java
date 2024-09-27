package l2_exercicio6;

public class Rico extends Pessoa {
    double dinheiro;

    public Rico(String nome, int idade, double dinheiro) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }

    public void fazCompras() {
        System.out.println(this.nome + " está fazendo compras com seus R$ " + this.dinheiro);
    }
}
