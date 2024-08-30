package aula_08_30;

public class Bola {
    private String cor, material;
    private double circunferencia;

    public Bola(String c, String mat, double circ) {
        this.cor = c;
        this.material = mat;
        this.circunferencia = circ;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public String getCor() {
        return this.cor;
    }

    public void setMat(String mat) {
        this.material = mat;
    }

    public String getMat() {
        return this.material;
    }

    public void setCirc(double circ) {
        this.circunferencia = circ;
    }

    public double getCirc() {
        return this.circunferencia;
    }
}