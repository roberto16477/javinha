package l2_exercicio4;

public class Main {
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro("Doguinho");
        System.out.println(cachorro.late());
        System.out.println(cachorro.caminha());

        Gato gato = new Gato("Bichano");
        System.out.println(gato.mia());
        System.out.println(gato.caminha());
    }
}
