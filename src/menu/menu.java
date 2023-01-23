package menu;

import java.util.List;
import java.util.Scanner;

import escolhedor.escolhedor;

public class menu {
	
	public static void principal(Scanner teclado) {
		boolean continua = true;
		do {
			
			System.out.println("===============================");
			System.out.println("1 - Iniciar o jogo");
			System.out.println("2 - Créditos");
			System.out.println("0 - Sair");
			System.out.println("===============================");
			int opcao1 = teclado.nextInt();
			
			switch(opcao1)	{
			
			case 1:
				
				menu.escolhaDaCategoria(teclado);
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
						escolhaDaCategoria(teclado);
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
			
		}while(continua == true);
		
	}
	
	public static void escolhaDaCategoria(Scanner teclado) {
		System.out.println("===============================");
		System.out.println("Qual você deseja ser a categoria das perguntas?");
		System.out.println("1 - Perguntas sobre Famosos" + "\n" + "2 - Perguntas sobre Comidas" + "\n" + "3 - Perguntas sobre Conhecimentos Gerais" + "\n" + "4 - Voltar" + "\n" + "0 - Sair");
		System.out.println("===============================");
	}
	
	public static void perguntafamosos(String question, Scanner teclado, int i, List famosos) {
		int um;
		switch(question) {
			case "1":
				System.out.println("===============================");
				System.out.println("Em que estado brasileiro nasceu a apresentadora Xuxa?");
				System.out.println("1 - Rio de Janeiro | 2 - Rio Grande do Sul | 3 - Santa Catarina | 4 - Goiás | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 2:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
			
			case "2":
				System.out.println("===============================");
				System.out.println("Qual era o apelido da cantora Elis Regina?");
				System.out.println("1 - Gauchinha | 2 - Paulistinha | 3 - Pimentinha | 4 - Andorinha | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 3:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
			
			case "3":
				System.out.println("===============================");
				System.out.println("Quem era o apresentador que reprovava os calouros tocando uma buzina?");
				System.out.println("1 - Raul Gil | 2 - Bolinha | 3 - Flávio Cavalcanti | 4 - Chacrinha | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 4:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
			case "4":
				System.out.println("===============================");
				System.out.println("Qual cantora tinha o apelido de 'Ternurinha' na época da jovem gorda?");
				System.out.println("1 - Sibrinha | 2 - Wanderleia | 3 - Gretchen | 4 - Martinha | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 2:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
			
			case "5":
				System.out.println("===============================");
				System.out.println("Qual cantor é pai da dupla Sandy e Junior?");
				System.out.println("1 - Leonardo | 2 - Xororó | 3 - Zezé Di Camargo | 4 - Chitãozinho | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 2:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
			case "6":
				System.out.println("===============================");
				System.out.println("Quem foi o criador dos personagens Pedrinho, Narizinho e Emília?");
				System.out.println("1 - Maurício de Sousa | 2 - Ziraldo | 3 - Monteiro Lobato | 4 - Machado de Assis | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 3:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
			case "7":
				System.out.println("===============================");
				System.out.println("Qual cantor ficou conhecido como 'Rei do Rock'?");
				System.out.println("1 - Frank Sinatra | 2 - Little Richard | 3 - Elvis Presley | 4 - Rickei Valens | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 3:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
			case "8":
				System.out.println("===============================");
				System.out.println("Joana Prado é o nome verdadeiro de qual artista?");
				System.out.println("1 - Tiozinha | 2 - Feiticeira | 3 - Lady Lu | 4 - Sheila Mello | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 2:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
			case "9":
				System.out.println("===============================");
				System.out.println("Qual ator do cinema brasileiro é conhecido por ter unhas enormes?");
				System.out.println("1 - Penadinho | 2 - Zé do Caixão | 3 - Zé do Casarão | 4 - Toninho do Diabo | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 2:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
			
			case "10":
				System.out.println("===============================");
				System.out.println("Quem foi técnico da seleção brasileira de futebol na copa de 1998?");
				System.out.println("1 - Zagallo | 2 - Scolari | 3 - Luxemburgo | 4 - Carpegianni | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 1:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
			case "11":
				System.out.println("===============================");
				System.out.println("Quem inventou o telefone?");
				System.out.println("1 - Graham Bell | 2 - George Washingtom | 3 - Thomas Edisom | 4 - Marconi | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 1:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
			case "12":
				System.out.println("===============================");
				System.out.println("Qual era a profissão exercída por Lula antes de ele ser Presidente do PT?");
				System.out.println("1 - Engraxate | 2 - Pedreiro | 3 - Feirante | 4 - Metalúrgico | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 4:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
			case "13":
				System.out.println("===============================");
				System.out.println("Em que estado nasceu a cantora Elba Ramalho?");
				System.out.println("1 - Paraíba | 2 - Ceará | 3 - Bahia | 4 - Alagoas | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 1:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
			case "14":
				System.out.println("===============================");
				System.out.println("Quem foi o cantor conhecido como o 'Rei da Voz'?");
				System.out.println("1 - Orlando Silva | 2 - Vicente Celestino | 3 - Francisco Alves | 4 - Carlos Gollardo | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 3:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
			case "15":
				System.out.println("===============================");
				System.out.println("Que atriz protagonizou o filme 'Titanic'?");
				System.out.println("1 - Cameron Diaz | 2 - Kate Winslet | 3 - Bridget Fonda | 4 - Catherine Zetta Jones | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 2:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
			case "16":
				System.out.println("===============================");
				System.out.println("Quem era o parceiro de aventuras de Dom Quixote?");
				System.out.println("1 - Sancho Pança | 2 - Guilherme Tell | 3 - Sigmund Freud | 4 - Lan Celot | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 1:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
			
			case "17":
				System.out.println("===============================");
				System.out.println("Que humorista, falecido em 1999, foi baterista de Raul Seixas?");
				System.out.println("1 - Lilico | 2 - Roni Cócegas | 3 - Grande Otelo | 4 - Mazzaropi | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 2:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
			case "18":
				System.out.println("===============================");
				System.out.println("Quem pintou o quadro conhecido como 'Monalisa'?");
				System.out.println("1 - Leonardo da Vinci | 2 - Ticiano | 3 - Rafael | 4 - Michelângelo | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 1:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
			case "19":
				System.out.println("===============================");
				System.out.println("Quem introduziu o futebol no Brasil?");
				System.out.println("1 - Pelé | 2 - João Havelange | 3 - Charles Miller | 4 - Paulo Machado | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 3:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
			case "20":
				System.out.println("===============================");
				System.out.println("Que atriz casou com Joé Dimaggio e Arthur Miller?");
				System.out.println("1 - Glenda Jackson | 2 - Margaret Becket | 3 - Marilyn Monroe | 4 - Elizabeth Taylor | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 3:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
			case "21":
				System.out.println("===============================");
				System.out.println("Qual a profissão de Cecília Meirelles?");
				System.out.println("1 - Cantora | 2 - Escritora | 3 - Arquiteta | 4 - Pianista | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 2:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
			case "22":
				System.out.println("===============================");
				System.out.println("'Camillo' é o sobrenome de qual cantor nascido em 'Brotas'?");
				System.out.println("1 - Leonardo | 2 - Chitãozinho | 3 - Daniel | 4 - Vinny | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 3:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
			case "23":
				System.out.println("===============================");
				System.out.println("De quem é o verso 'A praça é do povo, como o céu é do condor'?");
				System.out.println("1 - Tobias Barreto | 2 - Dorival Caymmi | 3 - Machado de Assis | 4 - Castro Alves | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 4:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
			
			case "24":
				System.out.println("===============================");
				System.out.println("Qual deste poetas foi indicado para o prêmio Nobel da Literatura?");
				System.out.println("1 - Márcio Quintana | 2 - Manuel Bandeira | 3 - Vinícius de Morais | 4 - Carlos Drummond | 5 - Trocar Categoria");
				System.out.println("===============================");
				um = teclado.nextInt();
				switch(um) {
					case 4:
						menu.confirmacaoF(teclado, i, famosos);
						break;
					case 5:
						confirmacaoTrocaCategoria(teclado);
						break;
					default:
						menu.confirmacaoEF(teclado, i);
						break;
				}
				break;
				
		}
	}
	
	public static void confirmacaoTrocaCategoria(Scanner teclado) {
		System.out.println("===============================");
		System.out.println("Tem certeza que você deseja trocar a categoria? Isso acarretará na reinicialização do jogo.");
		System.out.println("Digite 'Sim' para confirmar e 'Não' para negar(Tudo minúsculo e sem acento)");
		System.out.println("===============================");
		String confirmacao = teclado.next();
		
		switch(confirmacao) {
		case "sim":
			escolhaDaCategoria(teclado);
			
		case "nao":
			break;
		}
		
	}
	
	public static void confirmacaoEF(Scanner teclado, int i) {
		System.out.println("===============================");
		System.out.println("Você tem certeza da resposta? (Responda totalmente em letras minúsculas e sem acento)");
		System.out.println("===============================");
		String confirmacao = teclado.next();
		switch(confirmacao) {
		case "sim":
			int valor = 0;
			
			i = (i + 1);
			if(i <= 1) {
				valor = 0;
			}else if(i <= 4) {
				valor = 1000;
			}else if(i <=9) {
				valor = 5000;
			}else if(i <= 14) {
				valor = 10000;
			}else if(i <= 19) {
				valor = 50000;
			}else if(i <= 23) {
				valor = 500000;
			}
			
			System.out.println("Você errou!" + "\n" + "Você acertou " + (i - 1) + " perguntas e ganhou R$" + valor + ",00 reais.");
			principal(teclado);
			break;
			
		case "nao":
			break;
		default:
			System.out.println("Resposta inválida.");
		}
	}
	
	public static void confirmacaoF(Scanner teclado, int i, List famosos) {
		System.out.println("===============================");
		System.out.println("Você tem certeza da resposta? (Responda totalmente em letras minúsculas e sem acento)");
		System.out.println("===============================");
		String confirmacao = teclado.next();
		switch(confirmacao) {
		case "sim":
			i = i + 1;
			escolhedor.apresentacaoPerguntasFamosos(teclado, i, famosos);
			break;
			
		case "nao":
			break;
		default:
			System.out.println("Resposta inválida.");
		}
	}
	
	public static void creditos() {
		System.out.println("===============================");
		System.out.println("Este jogo foi criado por:");
		System.out.println("Turma 1i");
		System.out.println("Larissa Andrade" + "\n" + "Nathalia Gomes Nunes");
		System.out.println("===============================");
		System.out.println("0 - Sair");
		System.out.println("===============================");
	}
	
}
