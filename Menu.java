import java.util.List;
import java.util.Scanner;

public class Menu {
	private String tiltle;
	private List<String> options;

	public Menu(List<String> options) {
		this.tiltle = "Menu";
		this.options = options;
	}

	public Menu(String tiltle, List<String> options) {
		this.tiltle = tiltle;
		this.options = options;
	}

	public int getSelection() {
		int op = 0;
		while (op==0){
			System.out.println(tiltle+"\n");
			int i=1;
			for (String option : options) {
				System.out.println(i++ + " - " + option);
			}

			System.out.println("Informe a opcao desejada. ");
			Scanner s = new Scanner(System.in);
			String str = s.nextLine();
			try {
				op = Integer.parseInt(str);
			}
			catch (NumberFormatException e) {
				op =0;
			}
			if (op>=i){
				System.out.println("Opcao errada!");
				op=0;
			}
			
			s.close();
		}
		
		return op;
	}
}