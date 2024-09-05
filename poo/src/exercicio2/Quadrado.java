package exercicio2;

public class Quadrado {
    double tamanhoLado;

    public Quadrado(double tl){
        this.tamanhoLado = tl;
    }

    public void mudaLado(double tl) {
        this.tamanhoLado = tl;
    }

    public double mostraLado() {
        return this.tamanhoLado;
    }

    public double calculaArea() {
        return this.tamanhoLado * this.tamanhoLado;
    }
}
