package Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Escalacao {
    private LocalDate dataPartida;
    private Treinador treinador;
    private List<Jogador> jogadores;

    public Escalacao(LocalDate dataPartida, Treinador treinador) {
        this.dataPartida = dataPartida;
        this.treinador = treinador;
        this.jogadores = new ArrayList<>();
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
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

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    // Método para exibir a escalação
    public void exibirEscalacao() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato desejado
        System.out.println("Data da Partida: " + dataPartida.format(formatter));
        System.out.println("Treinador: " + treinador.getNome());
        System.out.println("Jogadores escalados:");
        for (Jogador jogador : jogadores) {
            System.out.println("- " + jogador);
        }
    }
}
