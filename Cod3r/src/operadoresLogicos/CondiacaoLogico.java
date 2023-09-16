package operadoresLogicos;

public class CondiacaoLogico {
	public static void main(String[] args) {
		
		boolean trabalho2 = false;
		boolean trabalho1 = false;
		
		boolean ComprouTV32 = trabalho1 ^ trabalho2;
		boolean ComprouTV50 = (trabalho1 && trabalho2);
		boolean TomouSvt = (ComprouTV32||ComprouTV50);
		
		System.out.println("Comprou TV 32 ?"+ComprouTV32);
		System.out.println("Comprou TV 50 ?"+ComprouTV50);
		System.out.println("Tomou Soverte ?"+TomouSvt);
	}
}
