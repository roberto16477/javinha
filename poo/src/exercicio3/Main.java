package exercicio3;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pessoa 1", 80.00, 1.73, 19);
        System.out.println("Dados Originais: ");
        System.out.println("nome: " + p1.nome);
        System.out.println("peso: " + p1.peso);
        System.out.println("altura: " + p1.altura);
        System.out.println("idade: " + p1.idade);
        System.out.println("-----------------------");

        p1.emagrecer();
        System.out.println("Novo peso: " + p1.peso);
        p1.engordar();
        System.out.println("Novo peso: " + p1.peso);
        p1.envelhecer();
        System.out.println("Nova idade: " + p1.idade);
        System.out.println("Nova altura: " + p1.altura);

    }
}
