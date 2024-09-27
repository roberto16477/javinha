package l2_exercicio6;

public class Main {
    public static void main(String[] args) {
        
        Pobre pessoaPobre = new Pobre("João", 45);
        pessoaPobre.trabalha();

        Rico pessoaRica = new Rico("Maria", 30, 100000);
        pessoaRica.fazCompras();
    }
}
