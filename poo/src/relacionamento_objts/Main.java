package relacionamento_objts;

public class Main {
    public static void main(String[] args) {
        Universidade princeton = new Universidade("Princeton");
        Universidade cambridge = new Universidade("Cambridge");

        Departamento fisica = new Departamento("Física", princeton);
        Departamento matematica = new Departamento("Matemática", cambridge);

        Pessoa einstein = new Pessoa("Albert Einstein", "14/3/1879", princeton, fisica);
        Pessoa newton = new Pessoa("Isaac Newton", "4/1/1643", cambridge, matematica);

        einstein.informarNomeEUniversidade();
        newton.informarNomeEUniversidade();
    }
}
