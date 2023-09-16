package desafioModulo;

public class Comida {

	String nomeC;
	double pesoC;
	
	Comida(String nomeC, double pesoC) {
		
		this.nomeC = nomeC ;
		this.pesoC = pesoC;
	}
	
	String formatarDadosC() {
		return String.valueOf("Alimento: "+nomeC+"\nCalorias: "+pesoC+"Kg");
	}
	
	void imprimirDadosC() {
		System.out.println(formatarDadosC());
	}

}
//nome comida, peso comida