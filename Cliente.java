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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString(){
        return "id: "+id+"\nNome: "+nome+"\nCPF: "+cpf;
    }


}
