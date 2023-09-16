package estruturasDeControle;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String conceito = "";
		System.out.println("Informe a nota");
		int nota = sc.nextInt();

		switch (nota) {
		case 10: case 9: case 8:
			conceito = "A";
			break;
		case 7: case 6: case 5:
			conceito = "B";
			break;
		case 4: case 3: case 2:
			conceito = "C";
		break;
		default:
			System.out.println("conceito não encontrado");
			break;
		}

		System.out.println("conceito = " + conceito);
		sc.close();
	}
}
