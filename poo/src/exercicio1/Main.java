package exercicio1;
public class Main{
    public static void main(String[] args) {
        Bola b1 = new Bola("vermelho", "plástico", 20);
        System.out.println("Cor Original: " + b1.mostraCor());
        b1.trocaCor("amarelo");
        System.out.println("Nova cor: " + b1.mostraCor());
    }
}