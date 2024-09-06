package exercicio5;

public class Main {
    public static void main(String[] args) {
        Tamagushi tama1 = new Tamagushi("Bichin", 5, 7, 2);

        System.out.println("\nInformações Originais:");
        tama1.exibirInfo();

        tama1.alterarNome("Bichão");
        tama1.alterarFome(9);
        tama1.alterarSaude(10);
        tama1.alterarIdade(3);

        System.out.println("\nInformações atualizadas:");
        tama1.exibirInfo();
    }
}