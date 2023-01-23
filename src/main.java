import java.util.Scanner;

import menu.menu;

public class main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		menu.principal(teclado);
		
		teclado.close();
	}

}
