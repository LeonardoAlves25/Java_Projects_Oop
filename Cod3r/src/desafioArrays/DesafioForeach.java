package desafioArrays;

import java.util.Arrays;

public class DesafioForeach {
	
	public static void main(String[] args) {
		
		//usando foreach para percorrer as arrays

		double notasAluno[] = new double[3];
		notasAluno[0] = 7.1;
		notasAluno[1] = 3.2;
		notasAluno[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAluno)); //usando o package java.util.Arrays
		
		double total = 0;
		for(double notas: notasAluno) {
			total += notas;
		}
		
		System.out.println(total/notasAluno.length);//média do aluno
		
		//Outra forma de declarar uma array
		
		final double notaFixa = 7.8;
		double notasAlunoB[] = {6.9, 7.5, notaFixa, 9.0};
		
		double totalB = 0.0;
		for (double notasB: notasAlunoB) {
			totalB += notasB;
		}
		System.out.println(totalB / notasAlunoB.length);
	}
}
