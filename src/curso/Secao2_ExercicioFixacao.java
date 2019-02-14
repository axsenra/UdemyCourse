package curso;

import java.util.Scanner;

public class Secao2_ExercicioFixacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		
		int higher = Integer.MIN_VALUE; 
		
		while( n <= 0) {
			
			System.out.println("Entre um numero positivo: ");
			n = sc.nextInt(); 
			
		}

		for (int i = 0; i<n ; i++) {
			
			int a = sc.nextInt(); 
			
			if ( a > higher) {
				higher = a ; 
			}
		}
		
		System.out.println("Higher: "+higher);
		sc.close();
		

	}

}
