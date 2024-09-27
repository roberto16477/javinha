package l2_exercicio2;

public class CamaroteSuperior extends Vip{
    float valorAdicionalSuperior;

    public CamaroteSuperior(float valor, float valorAdicional, float valorAdicionalSuperior) {
        super(valor, valorAdicional);  // Chama o construtor da classe VIP
        this.valorAdicionalSuperior = valorAdicionalSuperior;
    }

    // Método que retorna o valor do ingresso do camarote superior (valor do VIP + adicional)
    @Override
    public float getValor() {
        return super.getValor() + this.valorAdicionalSuperior;
    }
}
