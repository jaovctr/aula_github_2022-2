public class Conta {
    private String numeroConta;
    private Cliente cliente;
    private double saldo;

    public String getConta(){
        return "Cliente: "+ cliente.getCliente()+
        "\n Conta: "+ numeroConta+"\n Saldo: "+saldo;
    }

    public void setConta(String numeroConta,Cliente cliente, double saldo){
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo = saldo;
    }
}
