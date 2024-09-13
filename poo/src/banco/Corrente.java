package banco;
public class Corrente {
    private int numero;
    private double saldo;
    private String cliente;

    public Corrente (int num, double sal,String cli){
        this.numero = num;
        this.saldo = sal;
        this.cliente = cli;
    }

    public void creditar(double valor){
        this.saldo = this.saldo + valor;
    }

    public void debitar(double valor){
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saldo Insuficiente");
            }
        }

    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

}
