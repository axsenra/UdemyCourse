package _1exerciciosPropostos;

import java.util.Scanner;

public class Proposto01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Primeiro inteiro:");
		
		int x = sc.nextInt();
		
		System.out.println("Segundo inteiro:");
		
		int y = sc.nextInt();
		
		int z = x + y;
		
		System.out.println("Soma = "+z);

		
		sc.close();

	}

}
