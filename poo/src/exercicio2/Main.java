package exercicio2;

public class Main {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(2.0);
        System.out.println("Tamanho do lado original: " + q1.tamanhoLado);
        q1.mudaLado(4.0);
        System.out.println("Novo tamanho do lado: " + q1.mostraLado());
        System.out.println("Area do quadrado: " + q1.calculaArea());
    }
}
