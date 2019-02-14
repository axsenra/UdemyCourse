package entities;

public class Triangle {

	public double a;
	public double b;
	public double c; 
	
	
	// criando a função de calculo da area
	public double area() { // parenteses esta vazio porque o valor que ira receber ja esta dentro da clasee
		
		double p = (a + b + c)/2.00;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // return direto porque a funcao tem que retorna o valor da area
		
	}
}
