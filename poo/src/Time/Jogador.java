package Time;

public class Jogador extends Pessoa {
    private String posicao;

    public Jogador(String nome, String posicao) {
        super(nome);
        this.posicao = posicao;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return getNome() + " - Posição: " + posicao;
    }
}
