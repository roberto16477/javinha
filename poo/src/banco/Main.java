package banco;
public class Main{
    public static void main(String[] args) {
        Corrente conta1 = new Corrente(1, 1000, "Ana");
        Especial conta2 = new Especial(2, 2000, "Joao", 5000);

        conta1.debitar(2000);
        conta1.debitar(500);
        System.out.println("Seu saldo: " + conta1.getSaldo());
        conta1.creditar(1000);
        System.out.println("Seu saldo: " + conta1.getSaldo());
        System.out.println("----------------------------------------");

        conta2.debitar(10000);
        conta2.debitar(3000);
        System.out.println("Seu saldo: " + conta2.getSaldo());
        conta2.creditar(2000);
        System.out.println("Seu saldo: " + conta2.getSaldo());
        System.out.println("----------------------------------------");
    }
}