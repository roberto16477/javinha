package Time;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando treinadores
        Treinador treinador1 = new Treinador("Carlos Silva");
        Treinador treinador2 = new Treinador("Maria Oliveira");

        // Criando jogadores
        Jogador jogador1 = new Jogador("João Santos", "Atacante");
        Jogador jogador2 = new Jogador("Pedro Lima", "Meio-Campo");
        Jogador jogador3 = new Jogador("Roberto Costa", "Defensor");
        Jogador jogador4 = new Jogador("Lucas Almeida", "Goleiro");

        // Criando escalação para o treinador1
        Escalacao escalacao1 = new Escalacao(LocalDate.of(2024, 11, 28), treinador1);
        escalacao1.adicionarJogador(jogador1);
        escalacao1.adicionarJogador(jogador2);

        // Criando escalação para o treinador2
        Escalacao escalacao2 = new Escalacao(LocalDate.of(2024, 11, 30), treinador2);
        escalacao2.adicionarJogador(jogador3);
        escalacao2.adicionarJogador(jogador4);

        // Exibindo escalações
        System.out.println("=== Escalação 1 ===");
        escalacao1.exibirEscalacao();

        System.out.println("\n=== Escalação 2 ===");
        escalacao2.exibirEscalacao();
    }
}
