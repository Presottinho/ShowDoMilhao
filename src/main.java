import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import escolhedor.escolhedor;
import menu.menu;

public class main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		boolean continua = true;
		do {
			
			menu.principal();
			int opcao1 = teclado.nextInt();
			
		switch(opcao1) {
		
		case 1:
			
			escolhedor.perguntasFamosos();
			
			break;
		
		case 2:
			menu.creditos();
			int sair = teclado.nextInt();
			if(sair == 1) {
				break;
			}
			
			break;
			
		case 3:
			
			continua = false;
			break;
			
		default:
			System.out.println("Opção Inválida");
			break;
		
		}	
		}while(continua);
		
		teclado.close();
	}

}
