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
			
			int opcao1 = menu.principal(teclado);
			
		switch(opcao1) {
		
		case 1:
			
			menu.escolhaDaCategoria();
			int escolhaC = teclado.nextInt();
			switch(escolhaC) {
				case 1:
					escolhedor.perguntasFamosos(teclado, 0);
					break;
				case 2:
					escolhedor.perguntasComidas();
					break;
				case 3: 
					escolhedor.perguntasConhecimentoG();
					
				case 4:
					break;
				
				case 0:
					continua = false;
					break;
					
				default:
					System.out.println("Opção inválida, tente novamente.");
					menu.escolhaDaCategoria();
			}
			
			break;
		
		case 2:
			menu.creditos();
			int sair = teclado.nextInt();
			if(sair == 0) {
				break;
			}
			
			break;
			
		case 0:
			
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
