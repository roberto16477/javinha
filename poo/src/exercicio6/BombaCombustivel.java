package exercicio6;

public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor) {
        double litrosAbastecidos = valor / valorLitro;
        if (litrosAbastecidos > quantidadeCombustivel) {
            System.out.println("Não há combustível suficiente na bomba.");
        } 
        else {
            quantidadeCombustivel -= litrosAbastecidos;
            System.out.println("Quantidade de litros abastecidos: " + litrosAbastecidos);
        }
    }

    public void abastecerPorLitro(double litros) {
        double valorAPagar = litros * valorLitro;
        if (litros > quantidadeCombustivel) {
            System.out.println("Não há combustível suficiente na bomba.");
        } 
        else {
            quantidadeCombustivel -= litros;
            System.out.println("Valor a ser pago: R$ " + valorAPagar);
        }
    }

    public void alterarValor(double novoValorLitro) {
        this.valorLitro = novoValorLitro;
    }

    public void alterarCombustivel(String novoTipoCombustivel) {
        this.tipoCombustivel = novoTipoCombustivel;
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        this.quantidadeCombustivel = novaQuantidade;
    }

    public void exibirInfo() {
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Valor por Litro: R$ " + valorLitro);
        System.out.println("Quantidade de Combustível na Bomba: " + quantidadeCombustivel + " litros");
    }
}
