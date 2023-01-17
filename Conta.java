public class Conta {
    private String numeroConta;
    private Cliente cliente;
    private double saldo;

    public Conta(String numeroConta,Cliente cliente, double saldo){
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return "Cliente: "+ cliente.getCliente()+
                "\n Conta: "+ numeroConta+"\n Saldo: "+saldo;
    }
}
