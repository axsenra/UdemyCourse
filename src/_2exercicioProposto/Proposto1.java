package _2exercicioProposto;

import java.util.Scanner;

public class Proposto1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter a number: ");
		
		int n = sc.nextInt();
		
		if (n >= 0) { 
			System.out.println(" Nao negativo!");
		}else 
			System.out.println(" Negativo!");
		
		
		sc.close();

	}

}
