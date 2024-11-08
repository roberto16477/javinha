public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Universidade universidade;
    private Departamento departamento;

    public Pessoa(String nome, String dataNascimento, Universidade universidade, Departamento departamento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.universidade = universidade;
        this.departamento = departamento;
    }

    public void informarNomeEUniversidade() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Universidade: " + universidade.getNome());
        System.out.println("Departamento: " + departamento.getNome());
        System.out.println();
    }
}
