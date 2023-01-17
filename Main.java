import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static String ler_terminal(String texto) {
		System.out.println(texto);
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		return str;
	}
	
	public static void menuConta() {
		Menu mainMenu =  new Menu("Menu Conta", Arrays.asList("Depositar", "Sacar", "Saldo", "Sair"));
		int op;
		
		do {
			op = mainMenu.getSelection();
			
			switch(op){
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
			}
		} while (op != 4);
	}
	
	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList();
		
		Menu mainMenu =  new Menu("Menu Principal",
				Arrays.asList(
						"Cadastrar Cliente",
						"Cadastrar Conta",
						"Conta",
						"Sair"
				));
		int op;
		int id = 0;
		
		do {
			op = mainMenu.getSelection();
			
			switch(op){
				case 1:
					String nome = ler_terminal("Nome: ");
					String cpf = ler_terminal("CPF: ");
					clientes.add(new Cliente(++id, nome, cpf));
					break;
				case 2:
					break;
				case 3:
					menuConta();
			}
			
		} while (op != 4);
		
		System.out.println("Fim");
	}

}