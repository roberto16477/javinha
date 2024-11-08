public class Main {
    public static void main(String[] args) {
        // Criando objetos de Universidade
        Universidade princeton = new Universidade("Princeton");
        Universidade cambridge = new Universidade("Cambridge");

        // Criando objetos de Departamento
        Departamento fisica = new Departamento("Física", princeton);
        Departamento matematica = new Departamento("Matemática", cambridge);

        // Criando objetos de Pessoa
        Pessoa einstein = new Pessoa("Albert Einstein", "14/3/1879", princeton, fisica);
        Pessoa newton = new Pessoa("Isaac Newton", "4/1/1643", cambridge, matematica);

        // Testando os métodos
        einstein.informarNomeEUniversidade();
        newton.informarNomeEUniversidade();
    }
}
