package desafioArrays;

import java.util.Arrays;
import java.util.Scanner;

public class NotasArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de notas que deseja calcular: ");
		int quantNotas = sc.nextInt();
		double notas[] = new double[quantNotas];
		double total = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota "+(i+1)+":");
			notas[i] = sc.nextDouble();
		}
		
		for (double somaNotas: notas) {
			total += somaNotas;
		}
		
		System.out.println(Arrays.toString(notas));
		System.out.println("A media da nota do aluno e: "+total/notas.length);
		
		sc.close();
	}
}
