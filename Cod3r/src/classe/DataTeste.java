package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data test = new Data();
		test.obterDataFormatada();
		test.imprimirData();
		
		Data test2 = new Data(11,9,2001);
		test2.obterDataFormatada();
		test2.imprimirData();
		
		Data d1 = new Data();
		d1.dia = 25;
		d1.mes = 8;
		d1.ano = 2023;
		
		var d2 = new Data();
		d2.dia = 3;
		d2.mes = 9;
		d2.ano = 2004;
		
		d1.obterDataFormatada();
		d1.imprimirData();
		d2.obterDataFormatada();
		d2.imprimirData();
	}
}
