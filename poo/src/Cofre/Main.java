package Cofre;

public class Main {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();

        // Adicionando algumas moedas ao cofrinho
        cofrinho.adicionarMoeda(new Moeda(1.0, "Real"));
        cofrinho.adicionarMoeda(new Moeda(0.5, "Real"));
        cofrinho.adicionarMoeda(new Moeda(0.25, "Real"));
        cofrinho.adicionarMoeda(new Moeda(1.0, "Real"));

        // Testando os métodos
        System.out.println("Total depositado no cofrinho: " + cofrinho.calcularTotal());
        System.out.println("Número total de moedas: " + cofrinho.contarMoedas());
        System.out.println("Número de moedas de valor 1.0: " + cofrinho.contarMoedasPorValor(1.0));

        Moeda maiorMoeda = cofrinho.moedaDeMaiorValor();
        if (maiorMoeda != null) {
            System.out.println("Moeda de maior valor: " + maiorMoeda.getNome() + " - " + maiorMoeda.getValor());
        } else {
            System.out.println("Não há moedas no cofrinho.");
        }
    }
}
