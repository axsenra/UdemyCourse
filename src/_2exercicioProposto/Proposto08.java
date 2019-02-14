package _2exercicioProposto;

import java.util.Locale;
import java.util.Scanner;

public class Proposto08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		double nivel1 = (salario - 2000.00)*8/100;
		double nivel2 = (salario - 3000.00)*18/100 + 1000*8/100; 
		double nivel3 = (salario - 4500.00)*28/100 + 1000*8/100 + 1500*18/100;
		
		if( salario <= 2000.00) { 
			System.out.println(" Isento ");
			
		}else if( salario > 2000.00 && salario <= 3000.00) {
			System.out.printf("R$ %.2f",nivel1);
			
		}else if(salario > 3000.00 && salario <= 4500.00) {
			System.out.printf("R$ %.2f",nivel2);
		}else {
			System.out.printf("R$ %.2f",nivel3);
			
		}
		
		
		
		sc.close();
		
		
		
		
	}

}
