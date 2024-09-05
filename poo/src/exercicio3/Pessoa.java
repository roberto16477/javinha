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

    public void emagrecer(){
        this.peso -= 1.0;
    }

    public void engordar(){
        this.peso += 1.0;
    }

    public void crescer(){
        this.altura += 0.05;
    }

    public void envelhecer(){
        if (idade < 21){
            this.crescer();
        }
        this.idade += 1;
    }
}
