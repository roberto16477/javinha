package ContasL3;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    String cpf;
    List<Conta> contas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nome + ": [");
        for (int i = 0; i < contas.size(); i++) {
            sb.append(contas.get(i).toString());
            if (i < contas.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
