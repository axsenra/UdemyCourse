package _2exercicioProposto;

import java.util.Locale;
import java.util.Scanner;

public class Proposto06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double ent = sc.nextDouble(); 
		
		if (ent > 0 && ent<= 25) {
			System.out.println("Intervalo (0, 25]");
		}else if ( ent > 25 && ent <= 50) {
			System.out.println(" Intervalo (25, 50] ");
		}else if ( ent > 50 && ent <= 75) {
			System.out.println(" Intervalo (50, 75]");
		}else if (ent > 75) {
			System.out.println(" Intervalo (75, 100]");
		}else
			System.out.println(" Fora do intervalo ");
		
	
		
		sc.close();
		
		
		
		
	}

}
