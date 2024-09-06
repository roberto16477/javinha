package exercicio6;

public class Main {
    public static void main(String[] args) {
        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.57, 1000);

        bomba.exibirInfo();
        System.out.println("\nAbastecendo por valor...");
        bomba.abastecerPorValor(50);

        System.out.println("\nInformações atualizadas:");
        bomba.exibirInfo();

        System.out.println("\nAbastecendo por litros...");
        bomba.abastecerPorLitro(20);

        System.out.println("\nInformações atualizadas:");
        bomba.exibirInfo();
    }
}
