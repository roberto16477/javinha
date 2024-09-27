package l2_exercicio3;

public class Administrativo extends Assistente{
    String turno;  // "dia" ou "noite"
    float adicionalNoturno;

    // Construtor
    public Administrativo(String nome, String endereco, String telefone, String email, String matricula, String turno, float adicionalNoturno) {
        super(nome, endereco, telefone, email, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    // Métodos get
    public String getTurno() {
        return this.turno;
    }

    public float getAdicionalNoturno() {
        return this.adicionalNoturno;
    }
}
