package banco;

public class Clientes {
    String nome;
    String cpf;

    public Clientes(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    
    @Override
        public String toString(){
        return (" Cliente:" + this.nome);
    }
}
