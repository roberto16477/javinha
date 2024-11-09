package ContasL4;
public class Main {
    public static void main(String[] args) {

        Cliente cli1 = new Cliente("Joice", "23433378921");
        Corrente conta1 = new Corrente(1, 1000, cli1);
        Especial conta2 = new Especial(2, 2000, cli1, 5000);
        cli1.addConta(conta1);
        cli1.addConta(conta2);


        System.out.println("----------------------------------------");
        System.out.println("Cálculo de Tributos:");
        System.out.println("Tributos da conta corrente: " + conta1.calculaTributos());
        System.out.println("Tributos da conta especial: " + conta2.calculaTributos());
        System.out.println("----------------------------------------");
    }
}
