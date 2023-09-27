package desafioModulo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("leleo", 65.0);
		p1.formatarDadosP();
		p1.imprimirDadosP();
		System.out.println();
		
		Comida c = new Comida("tralala", 0.3);
		
		c.formatarDadosC();
		c.imprimirDadosC();
		p1.comer(c);
		System.out.println();
		
		var c2 = new Comida("abaicaixi", 0.4);
		
		c2.formatarDadosC();
		c2.imprimirDadosC();
		p1.comer(c2);
		System.out.println();
		
		var c3 = new Comida("sucodimurango", 0.5);
		
		c3.formatarDadosC();
		c3.imprimirDadosC();
		p1.comer(c3);
		System.out.println("");
		
		p1.formatarDadosP();
		p1.imprimirDadosP();
		
	}
}
//instanciar os metodos no método principal
//fazer com que a pessoa coma
//atribuir o peso