package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.89);

		var p2 = new Produto("Caneta Preta", 12.56);
		
		var p3 = new Produto("contole", 249.91);
		
		System.out.println(p1.nome+" "+p1.precoComDesconto()+"\n");
		System.out.println(p2.nome+" "+p2.precoComDesconto()+"\n");
		System.out.println(p3.nome+" "+p3.precoComDesconto()+"\n");
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double precoFinal3 = p3.precoComDesconto();
		double totalCarrinho = precoFinal1 + precoFinal2 + precoFinal3;
		
		System.out.printf("O total do valor dos produtos e: %.2f", totalCarrinho);
	}

}