package _2exercicioProposto;

import java.util.Locale;
import java.util.Scanner;

public class Proposto07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y; 
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if(x == 0.0 && y == 0.0) {
			System.out.println(" Origem ");
		}else if (x == 0 ) {
			System.out.println(" Eixo Y");
		}else if ( y == 0 ) {
			System.out.println(" Eixo X ");
		}else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}else if ( x > 0 && y <0) {
			System.out.println("Q4");
		}else if ( x < 0 && y < 0) {
			System.out.println("Q3");
		}else 
			System.out.println("Q2");
		
		
		
		sc.close();
		
		
		
		
		
	}

}
