package Time;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Treinador treinador1 = new Treinador("Jürgen Klopp", 15);
        Treinador treinador2 = new Treinador("Pep Guardiola", 15);

        Jogador jogador1 = new Jogador("Virgil Van Dijk", "Zagueiro");
        Jogador jogador2 = new Jogador("Macallister", "Meio-Campo");
        Jogador jogador3 = new Jogador("Mohamed Salah", "Atacante");
        Jogador jogador4 = new Jogador("Alisson Becker", "Goleiro");

        Jogador jogador5 = new Jogador("Kyle Walker", "Zagueiro");
        Jogador jogador6 = new Jogador("Kevin De Bruyne", "Meio-Campo");
        Jogador jogador7 = new Jogador("Erling Haaland", "Atacante");
        Jogador jogador8 = new Jogador("Ederson", "Goleiro");

        // Criando escalação para o treinador1
        Escalacao escalacao1 = new Escalacao(LocalDate.of(2024, 11, 28), treinador1);
        escalacao1.adicionarJogador(jogador1);
        escalacao1.adicionarJogador(jogador2);
        escalacao1.adicionarJogador(jogador3);
        escalacao1.adicionarJogador(jogador4);

        // Criando escalação para o treinador2
        Escalacao escalacao2 = new Escalacao(LocalDate.of(2024, 11, 30), treinador2);
        escalacao2.adicionarJogador(jogador5);
        escalacao2.adicionarJogador(jogador6);
        escalacao2.adicionarJogador(jogador7);
        escalacao2.adicionarJogador(jogador8);

        System.out.println("-------- Escalação 1 --------");
        escalacao1.exibirEscalacao();

        System.out.println("\n-------- Escalação 2 --------");
        escalacao2.exibirEscalacao();
    }
}
