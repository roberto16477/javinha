package Figuras;

public class Quadrado extends Figura implements AreaCalculavel {
    private double lado;

    public Quadrado(String cor, double lado) {
        super(cor);
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }
}
