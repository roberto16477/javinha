package l2_exercicio1;

public class Empregado {
    protected int codigo;
    protected String nome;
    protected String email;
    protected float salario;

    // Construtor da classe Empregado
    public Empregado(int cod, String nom, String mail, float sal) {
        this.codigo = cod;
        this.nome = nom;
        this.email = mail;
        this.salario = sal;
    }

    // Método para obter o salário atual
    public float getSalario() {
        return this.salario;
    }

    // Método para aplicar o aumento de salário
    public void aumentoSalarial(int percentual) {
        this.salario += this.salario * (percentual / 100.0);
    }
}
