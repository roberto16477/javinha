package l2_exercicio1;

public class Empregado {
    int codigo;
    String nome;
    String email;
    float salario;

    // Construtor da classe Empregado
    public Empregado(int cod, String nom, String mail, float sal) {
        this.codigo = cod;
        this.nome = nom;
        this.email = mail;
        this.salario = sal;
    }

    // Método para aplicar o aumento de salário
    public void aumentoSalarial(int percentual) {
        this.salario += this.salario * (percentual / 100.0);
    }

    public float getSalario() {
        return this.salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
