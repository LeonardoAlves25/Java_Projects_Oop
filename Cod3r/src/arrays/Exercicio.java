package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double notasAluno[] = new double[3]; //declaração mais comum 
		notasAluno[0] = 7.1;
		notasAluno[1] = 3.2;
		notasAluno[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAluno)); //usando o package java.util.Arrays
		
		double total = 0;
		for (int i = 0; i < notasAluno.length; i++) {
			total += notasAluno[i];
		}// atribuindo notas do aluno à variável total
		
		System.out.println(total/ notasAluno.length);//média do aluno
		
		//Outra forma de declarar uma array
		
		final double notaFixa = 7.8;
		double notasAlunoB[] = {6.9, 7.5, notaFixa, 9.0};
		
		double totalB = 0.0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
		}
		System.out.println(totalB / notasAlunoB.length);
	}
}
