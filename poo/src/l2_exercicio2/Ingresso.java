package l2_exercicio2;

public class Ingresso {
    float valor;

    public Ingresso(float valor) {
        this.valor = valor;
    }

    public void imprimeValor() {
        System.out.println("Valor do ingresso: R$ " + this.valor);
    }

    public float getValor() {
        return this.valor;
    }
}
