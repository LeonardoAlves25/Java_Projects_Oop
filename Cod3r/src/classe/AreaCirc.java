package classe;

public class AreaCirc {

	double raio;
	double varPi = 3.14;
	static double pi = 3.14;
	final static double piFinal = 3.1415;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return piFinal * Math.pow(raio, 2);
	}
	
	double area2() {
		return pi * Math.pow(raio, 2);
	}
	
	double area3() {
		return varPi * Math.pow(varPi, 2);
	}
}
