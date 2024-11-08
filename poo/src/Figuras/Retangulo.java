package Figuras;

public class Retangulo extends Figura implements AreaCalculavel {
    private double base;
    private double altura;

    public Retangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return base * altura;
    }
}
