package desafioModulo;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nomeP, double pesoP){	
		nome = nomeP;
		peso = pesoP;
	}
	
	void comer(Comida comida) {
		if(comida != null) this.peso += comida.pesoC;
	}
	
	String formatarDadosP() {
		return "Nome: "+nome+"\nPeso: "+peso+"Kg";
	}
	
	void imprimirDadosP() {
		System.out.println(formatarDadosP());
	}
	
}
//nome, peso, metodo comer(objeto classe comida)