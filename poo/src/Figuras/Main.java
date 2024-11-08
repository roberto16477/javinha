package Figuras;

public class Main {
    public static void main(String[] args) {
        // Criando objetos de figuras
        Quadrado quadrado = new Quadrado("Vermelho", 4);
        Retangulo retangulo = new Retangulo("Azul", 5, 3);
        Circulo circulo = new Circulo("Amarelo", 2.5);

        // Mostrando a cor e a área de cada objeto
        System.out.println("Quadrado - Cor: " + quadrado.getCor() + ", Área: " + quadrado.calculaArea());
        System.out.println("Retângulo - Cor: " + retangulo.getCor() + ", Área: " + retangulo.calculaArea());
        System.out.println("Círculo - Cor: " + circulo.getCor() + ", Área: " + circulo.calculaArea());
    }
}
