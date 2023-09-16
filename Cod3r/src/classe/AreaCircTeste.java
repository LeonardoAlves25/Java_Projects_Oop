package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		//Valor Pi estatico final
		AreaCirc a = new AreaCirc(10);
		System.out.println(a.area());
		
		//Valor Pi estatico
		var a2 = new AreaCirc(10);
		AreaCirc.pi = 3.14;
		System.out.println(a2.area2());
		
		//Valor Pi variável
		var a3 = new AreaCirc(10);
		a3.varPi = 5.73;
		System.out.println(a3.area3());
		
	}
}
