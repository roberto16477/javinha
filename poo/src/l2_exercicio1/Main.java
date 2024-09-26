package l2_exercicio1;

public class Main {
    public static void main(String[] args) {
        
        Empregado empregado = new Empregado(1, "Roberto Carlos", "roberto@gmail.com", 3000);
        System.out.println("Salário inicial do empregado "+ empregado.nome + ":" + empregado.getSalario());
        empregado.aumentoSalarial(10);  // Aumento de 10%
        System.out.println("Salário do empregado após aumento: " + empregado.getSalario());


        Chefe chefe = new Chefe(2, "Maria Souza", "maria@gmail.com", 5000, 500);
        System.out.println("\nSalário inicial do chefe "+ chefe.nome + ":" + chefe.getSalario());
        chefe.aumentoSalarial(10);  // Aumento de 10% + benefício
        System.out.println("Salário do chefe após aumento: " + chefe.getSalario());

        
        Estagiario estagiario = new Estagiario(3, "Paulo Vinicius", "paulo@gmail.com", 1000, 100);
        System.out.println("\nSalário inicial do estagiário "+ estagiario.nome +":"+ estagiario.getSalario());
        estagiario.aumentoSalarial(10);  // Aumento de 10% - descontos
        System.out.println("Salário do estagiário após aumento: " + estagiario.getSalario());
    }
}
