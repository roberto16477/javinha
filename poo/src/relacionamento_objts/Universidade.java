package relacionamento_objts;

public class Universidade {
    private String nome;

    public Universidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void informarNome() {
        System.out.println("Nome da Universidade: " + nome);
    }
}
