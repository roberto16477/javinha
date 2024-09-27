package l2_exercicio3;

public class Tecnico extends Assistente{
    float bonusSalarial;

    public Tecnico(String nome, String endereco, String telefone, String email, String matricula, float bonusSalarial) {
        super(nome, endereco, telefone, email, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    public float getBonusSalarial() {
        return this.bonusSalarial;
    }
}
