public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    
    public Cliente(int id, String nome, String cpf){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getCliente(){
        return "id: "+id+"\nNome: "+nome+"\nCPF: "+cpf;
    }
    
    public void setCliente(int id, String nome, String cpf){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
}
