package exercicio3;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pessoa 1", 80.00, 1.73, 19){
            System.out.println("Dados Originais: " + p1.nome + p1.peso + p1.altura + p1.idade);
        }
    }
}
