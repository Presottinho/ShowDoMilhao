package escolhedor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import menu.menu;

public class escolhedor {

	public static void perguntasFamosos(){
		
		List famosos = new ArrayList();
		
		famosos.add(1);
		famosos.add(2);
		famosos.add(3);
		famosos.add(4);
		famosos.add(5);
		famosos.add(6);
		famosos.add(7);
		famosos.add(8);
		famosos.add(9);
		famosos.add(10);
		famosos.add(11);
		famosos.add(12);
		famosos.add(13);
		famosos.add(14);
		famosos.add(15);
		famosos.add(16);
		famosos.add(17);
		famosos.add(18);
		famosos.add(19);
		famosos.add(20);
		famosos.add(21);
		famosos.add(22);
		famosos.add(23);
		famosos.add(24);

		Collections.shuffle(famosos);
		
		System.out.println(famosos);
		
		menu.perguntafamosos(famosos.get(0).toString());
		
	}
	
	public static void perguntasComidas() {
		
		List comidas = new ArrayList();
		
		comidas.add(1);
		comidas.add(2);
		comidas.add(3);
		comidas.add(4);
		
		Collections.shuffle(comidas);
		
	}
	
	public static void perguntasConhecimentoG(){
		
		List conhecimentoG = new ArrayList();
		
		conhecimentoG.add(1);
		conhecimentoG.add(2);
		conhecimentoG.add(3);
		conhecimentoG.add(4);
		
		Collections.shuffle(conhecimentoG);
		
	}
	
}
