package Time;

public class Main {
    public static void main(String[] args) {
        // Criando treinador
        Treinador treinador = new Treinador("Carlos Silva");

        // Criando jogadores
        Jogador jogador1 = new Jogador("João Santos", "Atacante");
        Jogador jogador2 = new Jogador("Pedro Lima", "Meio-Campo");
        Jogador jogador3 = new Jogador("Roberto Costa", "Defensor");

        // Criando escalação
        Escalacao escalacao = new Escalacao("28/11/2024", treinador);

        // Adicionando jogadores à escalação
        escalacao.adicionarJogador(jogador1);
        escalacao.adicionarJogador(jogador2);
        escalacao.adicionarJogador(jogador3);

        // Exibindo a escalação
        escalacao.exibirEscalacao();
    }
}
