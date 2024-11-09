package ContasL4;

public abstract class Conta {
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(int num, double sal, Cliente cli) {
        this.numero = num;
        this.saldo = sal;
        this.cliente = cli;
    }

    public void creditar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public abstract void debitar(double valor);

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Conta:" + this.numero + " Saldo:" + this.saldo;
    }
}
