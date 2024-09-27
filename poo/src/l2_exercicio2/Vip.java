package l2_exercicio2;

public class Vip extends Ingresso {
    float valorAdicional;

    public Vip(float valor, float valorAdicional) {
        super(valor);  // Chama o construtor da classe base Ingresso
        this.valorAdicional = valorAdicional;
    }

    @Override
    public float getValor() {
        return this.valor + this.valorAdicional;
    }
}
