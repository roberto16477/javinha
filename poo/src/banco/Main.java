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

        Poupanca conta3 = new Poupanca(3,1000, "Claudia",1000);
        Investimento conta4 = new Investimento(4, 1000, "Cida", 8, 10);
        Investimento conta5 = new Investimento(5, 1000, "Eva", 22, 5);

        conta3.debitar(1500);
        conta3.debitar(500);

        System.out.println("Seu saldo: " + conta3.getSaldo());
        System.out.println("Seu saldo mínimo: " + conta3.getSaldominimo());
        conta3.creditar(1500);

        System.out.println("Seu saldo: " + conta3.getSaldo());
        System.out.println("Seu saldo mínimo: " + conta3.getSaldominimo());
        conta3.atualizarSaldo();

        System.out.println("Seu saldo: " + conta3.getSaldo());
        System.out.println("Seu saldo mínimo: " + conta3.getSaldominimo());
        System.out.println("----------------------------------------");

        conta4.atualizarSaldo();
        System.out.println("Seu saldo é: " + conta4.getSaldo());
        conta5.atualizarSaldo();
        System.out.println("Seu saldo é: " + conta5.getSaldo());
    }
}