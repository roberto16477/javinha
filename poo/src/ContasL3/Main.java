package ContasL3;

public class Main {
    public static void main(String[] args) {

        Cliente cli1 = new Cliente("Joice", "23433378921");
        Corrente conta1 = new Corrente(1, 1000, cli1);
        Especial conta2 = new Especial(2, 2000, cli1, 5000);
        cli1.addConta(conta1);
        cli1.addConta(conta2);

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

        Cliente cli2 = new Cliente("Claudia", "23433391034");
        Poupanca conta3 = new Poupanca(3, 1000, cli2, 1000);
        cli2.addConta(conta3);

        Cliente cli3 = new Cliente("Cida", "23433382514");
        Investimento conta4 = new Investimento(4, 1000, cli3, 8, 10);
        cli3.addConta(conta4);

        Cliente cli4 = new Cliente("Eva", "2343338");
        Investimento conta5 = new Investimento(5, 1000, cli4, 22, 5);
        cli4.addConta(conta5);

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

        // Imprime os clientes com suas contas
        System.out.println("----------------------------------------");
        System.out.println("Clientes e suas contas:");
        System.out.println(cli1);
        System.out.println(cli2);
        System.out.println(cli3);
        System.out.println(cli4);
        System.out.println("----------------------------------------");
    }
}
