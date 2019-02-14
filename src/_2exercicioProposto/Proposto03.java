package _2exercicioProposto;

import java.util.Scanner;

public class Proposto03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Entern number 1: ");
		int a = sc.nextInt();
		
		System.out.println(" Enter number 2: ");
		int b = sc.nextInt(); 
		
		if ( a > b && (a % b) == 0) {
			System.out.println(" Sao multiplos! ");
		}else if (b > a && (b % a )==0) {
			System.out.println(" Sao multiplos! ");
		}else 
			System.out.println(" NAO SAO MULTIPLOS");
		
		
		
		sc.close();
		
		
	}

}
