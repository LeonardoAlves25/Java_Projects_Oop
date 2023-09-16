package estruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Instucoes: \nDigite suas notas de 0 a 10 \n" + "Digite -1 para consultar sua media\n");

		float nota = 0;
		short cont = 0;
		float total = 0;

		while (nota != -1) {
			System.out.println("Nota " + cont + ":");
			nota = sc.nextFloat();
			if (nota != -1 && nota <= 10 && nota >=0) {
				total += nota;
				System.out.println(total);
				cont++;
			} else if (nota != -1){
				System.out.println("!Erro! Por favor, digite uma nota valida");
				continue;
			}

		}
		float media = total / cont;
		System.out.println("\n Sua media final e: " + media);
		sc.close();
	}
}
