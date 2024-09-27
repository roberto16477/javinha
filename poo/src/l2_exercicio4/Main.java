package l2_exercicio4;

public class Main {
    public static void main(String[] args) {
        // Instanciando um Cachorro e fazendo-o latir e caminhar
        Cachorro cachorro = new Cachorro("Doguinho");
        System.out.println(cachorro.late());
        System.out.println(cachorro.caminha());

        // Instanciando um Gato e fazendo-o miar e caminhar
        Gato gato = new Gato("Bichano");
        System.out.println(gato.mia());
        System.out.println(gato.caminha());
    }
}
