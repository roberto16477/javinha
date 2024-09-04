package aula_08_30;
public class Main{
    public static void main(String[] args) {
        Bola primeira = new Bola("vermelho", "plástico", 20);
        System.out.println("Cor Original: " + primeira.mostraCor());
        primeira.trocaCor("amarelo");
        System.out.println("Nova cor: " + primeira.mostraCor());
    }
}