public class Conta {
    private int numeroConta;
    private Cliente cliente;
    private double saldo;
    private String ext = "";

    public Conta(int numeroConta,Cliente cliente, double saldo){
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
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
        return "Cliente: "+ cliente.getNome()+
                "\n Conta: "+ numeroConta+"\n Saldo: "+saldo;
    }

    public void credito(double valor) {
		saldo += valor;
		ext+="Crédito: "+valor+"."+"Saldo: "+saldo+"\n";
	}
	
	public void debito(double valor) {
		if(saldo<valor) {
			System.out.println("Saldo insuficiente para debitar!");
		}else {
			saldo -= valor;
			ext+="Débito: "+valor+"."+"Saldo: "+saldo+"\n";
		}	
	}
	
	public String getExtrato() {
		return ext;
	}
}
