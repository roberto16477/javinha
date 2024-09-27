package l2_exercicio2;

public class CamaroteInferior extends Vip{
    String localizacao;

    public CamaroteInferior(float valor, float valorAdicional, String localizacao) {
        super(valor, valorAdicional);  // Chama o construtor da classe VIP
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização do Camarote Inferior: " + this.localizacao);
    }

    @Override
    public void imprimeValor() {
        System.out.println("Valor do Camarote Inferior: " + this.getValor());
    }

    @Override
    public float getValor() {
        return this.valor + this.valorAdicional;
    }

}
