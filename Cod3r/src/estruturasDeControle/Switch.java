package estruturasDeControle;

public class Switch {
	
	public static void main(String[] args) {
		//Switch without break
		
	int idade = 0;	
		switch (idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0: 
			System.out.println("Sabe respirar");
		}
	}
}

// Sem break o switch se torna acumulativo