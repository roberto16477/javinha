package Time;

import java.util.ArrayList;
import java.util.List;

public class Escalacao {
    private String dataPartida;
    private Treinador treinador;
    private List<Jogador> jogadores;

    public Escalacao(String dataPartida, Treinador treinador) {
        this.dataPartida = dataPartida;
        this.treinador = treinador;
        this.jogadores = new ArrayList<>();
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    // Método para adicionar um jogador à escalação
    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    // Método para exibir a escalação
    public void exibirEscalacao() {
        System.out.println("Data da Partida: " + dataPartida);
        System.out.println("Treinador: " + treinador.getNome());
        System.out.println("Jogadores escalados:");
        for (Jogador jogador : jogadores) {
            System.out.println("- " + jogador);
        }
    }
}
