package capitulo_03;

import java.util.Locale;
import java.util.Scanner;
import entities.Calculator;

public class Aula_51_MembroStatico_v2 {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator(); 
		
		
		System.out.println("Enter Radius: ");
		double radius = sc.nextDouble(); 
		
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		
		System.out.printf("Circumferece %.2f%n", c);
		System.out.printf("Volume %.2f%n", v);
		System.out.printf("Valor de PI %.2f%n", calc.PI);
		
		
		sc.close();
		
	}

}
