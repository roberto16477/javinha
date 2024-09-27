package l2_exercicio3;

public class Main {
    public static void main(String[] args) {
        // Criando um Assistente Técnico
        Tecnico tecnico = new Tecnico("Carlos Silva", "Rua A", "9999-9999", "carlos@email.com", "T123", 500.0f);
        System.out.println("Nome do Técnico: " + tecnico.getNome());
        System.out.println("Matrícula do Técnico: " + tecnico.getMatricula());
        System.out.println("Bônus salarial do Técnico: R$ " + tecnico.getBonusSalarial());

        // Criando um Assistente Administrativo
        Administrativo administrativo = new Administrativo("Ana Pereira", "Rua B", "8888-8888", "ana@email.com", "A456", "noite", 300.0f);
        System.out.println("\nNome do Administrativo: " + administrativo.getNome());
        System.out.println("Matrícula do Administrativo: " + administrativo.getMatricula());
        System.out.println("Turno do Administrativo: " + administrativo.getTurno());
        System.out.println("Adicional noturno do Administrativo: R$ " + administrativo.getAdicionalNoturno());
    }
}
