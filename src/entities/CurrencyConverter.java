package entities;

public class CurrencyConverter {
	
	public static double IOF = 0.06; 
	
	public static double reais(double dollar, double qty) {
		return dollar * qty * (1+IOF); 
	}

}
