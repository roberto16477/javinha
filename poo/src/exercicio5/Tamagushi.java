package exercicio5;

public class Tamagushi {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public Tamagushi(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void alterarFome(int fome) {
        this.fome = fome;
    }

    public void alterarSaude(int saude) {
        this.saude = saude;
    }

    public void alterarIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getFome() {
        return fome;
    }

    public int getSaude() {
        return saude;
    }

    public int getIdade() {
        return idade;
    }

    public String getHumor() {
        int humor = (fome + saude) / 2;

        if (humor < 4) {
            return "triste";
        } else if (humor < 8) {
            return "normal";
        } else {
            return "feliz";
        }
    }

    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Fome: " + getFome());
        System.out.println("Saúde: " + getSaude());
        System.out.println("Idade: " + getIdade());
        System.out.println("Humor: " + getHumor());
    }
}
