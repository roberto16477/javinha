package l2_exercicio6;

public class Main {
    public static void main(String[] args) {
        // Instanciando uma pessoa pobre e fazendo-a trabalhar
        Pobre pessoaPobre = new Pobre("João", 45);
        pessoaPobre.trabalha();

        // Instanciando uma pessoa rica e fazendo-a fazer compras
        Rico pessoaRica = new Rico("Maria", 30, 100000);
        pessoaRica.fazCompras();
    }
}
