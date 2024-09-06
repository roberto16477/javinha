package exercicio1;

public class Bola {
    private String cor, material;
    private double circunferencia;

    public Bola(String c, String mat, double circ) {
        this.cor = c;
        this.material = mat;
        this.circunferencia = circ;
    }

    public void trocaCor(String c) {
        this.cor = c;
    }

    public String mostraCor() {
        return this.cor;
    }
}
