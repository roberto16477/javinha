package exercicio3;

public class Pessoa {
    String nome;
    double peso, altura;
    int idade;

    public Pessoa(String n, double p, double a, int i){
        this.nome = n;
        this.peso = p;
        this.altura = a;
        this.idade = i;
    }

    public void emagrecer(double p){
        this.peso = p - 1;
    }
}
