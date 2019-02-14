package capitulo_03;

import java.util.Locale;
import java.util.Scanner;
import entities.Calculator_Statico;

public class Aula_51_MembroStatico_v3 {

	public static void main(String[] args) {
		
Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius: ");
		double radius = sc.nextDouble(); 
		
		double c = Calculator_Statico.circumference(radius);
		double v = Calculator_Statico.volume(radius);
		
		System.out.printf("Circumferece %.2f%n", c);
		System.out.printf("Volume %.2f%n", v);
		System.out.printf("Valor de PI %.2f%n", Calculator_Statico.PI);
		
		
		sc.close();
		
		
	}

}
