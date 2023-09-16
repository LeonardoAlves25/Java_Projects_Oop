package operadoresLogicos;

public class Oper_Relacionais_Logico {
	
	public static void main(String[] args) {
		
		double nota = 7.6;
		boolean Comportamento = false;
		boolean PassouNota = nota >= 7;
		boolean PassouDeAno = PassouNota ^ Comportamento;
		
		System.out.println("Passou ?"+PassouDeAno);
	}
}
