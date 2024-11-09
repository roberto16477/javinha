package Cofre;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    private List<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    // Método para adicionar uma moeda ao cofrinho
    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    // Método para calcular o total de valor das moedas no cofrinho
    public double calcularTotal() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.getValor();
        }
        return total;
    }

    // Método para contar o número de moedas armazenadas
    public int contarMoedas() {
        return moedas.size();
    }

    // Método para contar o número de moedas de um determinado valor
    public int contarMoedasPorValor(double valor) {
        int count = 0;
        for (Moeda moeda : moedas) {
            if (moeda.getValor() == valor) {
                count++;
            }
        }
        return count;
    }

    // Método para informar qual a moeda de maior valor
    public Moeda moedaDeMaiorValor() {
        if (moedas.isEmpty()) {
            return null; // Retorna null se não houver moedas
        }
        Moeda maior = moedas.get(0);
        for (Moeda moeda : moedas) {
            if (moeda.getValor() > maior.getValor()) {
                maior = moeda;
            }
        }
        return maior;
    }
}
