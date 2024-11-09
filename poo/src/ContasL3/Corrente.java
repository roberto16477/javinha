package ContasL3;

public class Corrente extends Conta {
    public Corrente(int num, double sal, Cliente cli) {
        super(num, sal, cli);
    }

    @Override
    public void debitar(double valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    @Override
    public String toString() {
        return "Conta:" + this.numero + " Saldo:" + this.saldo;
    }
}
