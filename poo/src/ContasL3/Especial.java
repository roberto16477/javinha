package ContasL3;

public class Especial extends Corrente {
    private int limite;

    public Especial(int num, double sal, Cliente cli, int lim) {
        super(num, sal, cli);
        this.limite = lim;
    }

    @Override
    public void debitar(double valor) {
        if (valor <= (super.getSaldo() + this.limite)) {
            super.setSaldo(super.getSaldo() - valor);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
}
