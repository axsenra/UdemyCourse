package capitulo_03;

import java.util.Locale;
import java.util.Scanner;

public class Aula_50_MembrosStaticos {

	public static final double PI = 3.14159; // palavra que representa constante é MAIUSCULO
	
	public static void main(String[] args) {
		
		
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius: ");
		double radius = sc.nextDouble(); 
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circumferece %.2f%n", c);
		System.out.printf("Volume %.2f%n", v);
		System.out.printf("Valor de PI %.2f%n", PI);
		
		
		sc.close();
		
	}

	public static double circumference(double radius) {  //funcão deve ser STATIC porque esta dentro do MAIN que é STATIC
		return 2 * PI * radius ;
	}
	
	public static double volume(double radius) {   //funcão deve ser STATIC porque esta dentro do MAIN que é STATIC
		return 4 * PI * radius *radius *radius /3 ;
	}
	
}
