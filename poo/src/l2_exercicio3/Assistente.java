package l2_exercicio3;

public class Assistente extends Funcionario{
    String matricula;

    public Assistente(String nome, String endereco, String telefone, String email, String matricula) {
        super(nome, endereco, telefone, email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }
}
