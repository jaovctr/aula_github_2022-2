import java.util.Scanner;

public class Banco {
    private  int MAXIMO=50;
	private Conta[] contas = new Conta[MAXIMO];
	private int pos_conta_atual=0;
	Scanner input = new Scanner(System.in);
	

	public void incluir(Conta c){
		if(pos_conta_atual<MAXIMO) {
			
	
			System.out.println("Digite o número da conta:");
			int num = input.nextInt();
			input.nextInt();
			
			if(pos_conta_atual==0 || pesquisarConta(c.getNumeroConta()) == -9999) {

				System.out.println("Digite o cpf do titular:");
	
                System.out.println("Digite o saldo inicial:");
                double saldoInicial = input.nextDouble();
				Conta conta = new Conta (num, c.getCliente(), saldoInicial);
				contas[pos_conta_atual++] = conta;
			}else {
				System.out.println("Já existe uma conta com esse número!");
			}
		}
	}
	
	
	private int pesquisarConta(int num) {
		for(int i=0; i<pos_conta_atual; i++) {
			if(num==contas[i].getNumeroConta()) {
				return i;
			}
		}
		return -9999;
	}
	
	
	public void transferencia(int num_conta_de, int num_conta_para, double val) {
		int aux_1, aux_2;
		aux_1 = pesquisarConta(num_conta_de);
		aux_2 = pesquisarConta(num_conta_para);
		
		if(aux_1!=-9999 && aux_2!=-9999) {
			if(contas[aux_1].getSaldo()>= val) {
				contas[aux_1].debito(val);
				contas[aux_2].credito(val);
			}else {
				System.out.println("Impossível realizar operação: Saldo insuficiente!");
			}
		}else {
			System.out.println("Não é possível realizar essa operação pois uma ou as duas contas não existem!");
		}
	}
	
	
	public void saque(int num, double val) {
		int aux = pesquisarConta(num);
		if(aux!=-9999) {
			contas[aux].debito(val);
		}
	}
	
	
	public void deposito(int num, double val) {
		int aux = pesquisarConta(num);
		if(aux!=-9999) {
			contas[aux].credito(val);
		}
	}
	
	public double saldo(int num) {
		int aux = pesquisarConta(num);
		if(aux!=-9999) {
			return contas[aux].getSaldo();
		}else {
			return -999999;
		}
	}
	
	public String extrato(int num) {
		int aux = pesquisarConta(num);
		if(aux!=-9999) {
			return contas[aux].getExtrato();
		}else {
			return "Conta inexistente. Extrato indisponível.";
		}
	}
	
	
}
