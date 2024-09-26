package l2_exercicio1;

public class Chefe extends Empregado {
    float beneficio;

    public Chefe(int cod, String nom, String mail, float sal, float ben) {
        super(cod, nom, mail, sal);
        this.beneficio = ben;
    }

    @Override
    public void aumentoSalarial(int percentual) {
        this.salario += this.salario * (percentual / 100.0) + this.beneficio;
    }
}
