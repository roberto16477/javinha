public class Departamento {
    private String nome;
    private Universidade universidade;

    public Departamento(String nome, Universidade universidade) {
        this.nome = nome;
        this.universidade = universidade;
    }

    public String getNome() {
        return nome;
    }

    public Universidade getUniversidade() {
        return universidade;
    }
}
