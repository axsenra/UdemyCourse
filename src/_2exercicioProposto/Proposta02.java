package _2exercicioProposto;

import java.util.Scanner;

public class Proposta02 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter a number:");
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		if (n == 0) {
			System.out.println(" PAR ");
		} 
		else if ( n % 2 == 0 ) {
			System.out.println(" PAR ");
		}else 
			System.out.println(" IMPAR ");
		
		if ( x % 2 == 0 ) {
			System.out.println(" funciona divisao negativa");
		}else System.out.println(" Funciona mas o eh IMPAR ");
		
		
		sc.close();
		
	}

}
