package Time;

public class Treinador extends Pessoa {
    private int anosExperiencia;

    public Treinador(String nome, int anosExperiencia) {
        super(nome);
        this.anosExperiencia = anosExperiencia;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return getNome() + " - Anos de Experiência: " + anosExperiencia;
    }
}
