package banco;

public class Poupanca {

    private double saldominimo;

    public CPoupanca(int num, double sal, String cli, double salmin) {
        super(num, sal, cli);
        this.saldominimo = salmin;
    }

    @Override
    public void debitar(double valor) {
        if (valor <= super.getSaldo()) {
            super.setSaldo(super.getSaldo() - valor);
            if (super.getSaldo() < this.saldominimo) {
                this.saldominimo = super.getSaldo();
            }
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
}
