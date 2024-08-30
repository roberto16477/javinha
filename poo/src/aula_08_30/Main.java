package aula_08_30;
public class Main{
    public static void main(String[] args) {
        Bola primeira = new Bola("vermelho", "plástico", 20);
        System.out.println("Cor: " + primeira.getCor());
        primeira.setCor("amarelo");
        System.out.println("Nova cor: " + primeira.getCor());

        System.out.println("Material: " + primeira.getMat());
        primeira.setMat("madeira");
        System.out.println("Novo material: " + primeira.getMat());

        System.out.println("Circunferência: " + primeira.getCirc());
        primeira.setCirc(10);
        System.out.println("Nova circunferência: " + primeira.getCirc());
    }
}