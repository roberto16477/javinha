package ContasL4;

import java.util.*;

public class Investimento extends Corrente {

    private int diainvestimento;
    private int periodo;

    public Investimento(int num, double sal, Cliente cli, int dinv, int per) {
        super(num, sal, cli);
        this.diainvestimento = dinv;
        this.periodo = per;
    }

    public void atualizarSaldo() {
        Calendar dataAtual = Calendar.getInstance();
        int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
        System.out.println(dia);
        if (dia == (this.diainvestimento + periodo)) {
            super.setSaldo((float) (super.getSaldo() * 1.20));
        } else {
            System.out.println("Ainda não é dia do investimento");
        }
    }

    public int getDiainvestimento() {
        return diainvestimento;
    }

    public void setDiainvestimento(int diainvestimento) {
        this.diainvestimento = diainvestimento;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
}
