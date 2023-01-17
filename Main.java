package aula;

import java.util.Arrays;

public class Main {
	
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
		Menu mainMenu =  new Menu("Menu Principal",
				Arrays.asList(
						"Cadastrar Cliente",
						"Cadastrar Conta",
						"Conta",
						"Sair"
				));
		int op;
		
		do {
			op = mainMenu.getSelection();
			
			switch(op){
				case 1:
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