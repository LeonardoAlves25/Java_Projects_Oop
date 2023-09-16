package estruturasDeControle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String Text = "";
		
		do{
			System.out.println("Voce precisa falar" 
					+ "as palavras magicas!");
			System.out.println("Quer sair?");
			Text = sc.nextLine();
		} while(!Text.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigado!");
		sc.close();
	}
}

		//if(...) sentence; or {}
		// while (....) sentence; or {}
		// for(...; ....; ...) sentence; or {}
		// do sentence; or {} while(...);