package _4exercicioProposto;

import java.util.Scanner;

public class Proposto01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int X = sc.nextInt(); 
		
		
		
		for(int i=1; i<=X ; i++) {
			
			if ((i % 2) != 0 ) {
				System.out.println(i);
			}
			
			
			
		}
		
		
		sc.close();

	}

}
