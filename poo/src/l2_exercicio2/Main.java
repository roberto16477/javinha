package l2_exercicio2;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(50.0f);
        ingresso.imprimeValor();

        Vip ingressoVIP = new Vip(50.0f, 30.0f);
        System.out.println("Valor do ingresso VIP: R$ " + ingressoVIP.getValor());

        Normal ingressoNormal = new Normal(50.0f);
        ingressoNormal.imprimeTipo();
        ingressoNormal.imprimeValor();

        CamaroteInferior camaroteInferior = new CamaroteInferior(50.0f, 30.0f, "Setor A");
        camaroteInferior.imprimeValor();
        camaroteInferior.imprimeLocalizacao();

        // Testando a classe Camarote Superior
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(50.0f, 30.0f, 20.0f);
        System.out.println("Valor do ingresso Camarote Superior: R$ " + camaroteSuperior.getValor());
    }
}
