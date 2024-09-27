package l2_exercicio2;

public class Ingresso {
    float valor;

    public Ingresso(float valor) {
        this.valor = valor;
    }

    // Método que imprime o valor do ingresso
    public void imprimeValor() {
        System.out.println("Valor do ingresso: R$ " + this.valor);
    }

    // Método para obter o valor do ingresso
    public float getValor() {
        return this.valor;
    }
}
