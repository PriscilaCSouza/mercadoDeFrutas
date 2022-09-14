import java.util.ArrayList;
import java.util.Scanner;

public class ControleFrutas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		// Variáveis
		
		int opc, alt; 
		String fruta; 
		ArrayList<String> frutas = new ArrayList<String>();
		
		// Opções
		
		do {
			System.out.println("Bem vindo ao sistema de gerenciamento do Mercado de Frutas!\n");
			System.out.println("Escolha uma das opção abaixo:\n");
			System.out.println("1 - Cadastrar uma fruta");
			System.out.println("2 - Mostrar todas as frutas");
			System.out.println("3 - Alterar fruta");
			System.out.println("4 - Sair do programa");
		
		opc = teclado.nextInt();
		
		// Casos
		
		switch(opc) {
		case 1:
			System.out.println("Digite a frutas que você quer cadastrar");
			fruta = teclado.next();
			frutas.add(fruta);
			System.out.println("Fruta cadastrada com sucesso!");
				
		case 2: 
			System.out.println(frutas);
			break;
			
		case 3:
			System.out.println("Qual fruta você deseja alterar?");
			alt = teclado.nextInt();
			System.out.println("Você selecionou a fruta " + frutas.get(alt));
			System.out.println("Por qual fruta você deseja substituir?");
			fruta = teclado.next();
			frutas.set(alt, fruta);
			break;
			
		case 4:
			System.out.println("Sistema encerrado, volte sempre!");
			break;
			
		default:
			System.out.println("Opção inválida!");
		}
		
	}  while(opc != 4);
		
		teclado.close();
	
	}
	
}