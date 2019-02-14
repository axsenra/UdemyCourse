package _2exercicioProposto;

import java.util.Locale;
import java.util.Scanner;

public class Proposto05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cod1 = 4.00;
		double cod2 = 4.50;
		double cod3 = 5.0;
		double cod4 = 2.0;
		double cod5 = 1.5;
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x == 3) {
			System.out.printf("Total: R$ %.2f",cod3*y);
		}else if (x == 2) {
			System.out.printf("Total: R$ %.2f",cod2*y);
		}else
			System.out.println("Codigo invalido!");
		
		
		
		
		sc.close();
		
		
		
	}

}
