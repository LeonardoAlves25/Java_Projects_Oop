package classe;

public class ExThis {
	
	int dia, mes, ano;	// Variável que está sendo usada no construtor
	
	ExThis(){
		this(3, 9, 2000);		
	}
	
	ExThis(int dia, int mes, int ano){ // Construtor 
		this.dia = dia++;
		this.mes = mes++;
		this.ano = ano++;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes ,ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
	public static void main(String[] args) {
		
		ExThis d = new ExThis();
		d.obterDataFormatada();
		d.imprimirDataFormatada();
		
		ExThis e = new ExThis(1, 1, 1964);
		e.obterDataFormatada();
		e.imprimirDataFormatada();
	}
}
