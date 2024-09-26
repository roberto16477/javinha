package l2_exercicio1;

public class Estagiario extends Empregado {
    int descontos;

    // Construtor da classe Estagiário
    public Estagiario(int cod, String nom, String mail, float sal, int desc) {
        super(cod, nom, mail, sal);
        this.descontos = desc;
    }

    @Override
    public void aumentoSalarial(int percentual) {
        this.salario += this.salario * (percentual / 100.0) - this.descontos;
    }
}
