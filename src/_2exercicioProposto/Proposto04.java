package _2exercicioProposto;

import java.util.Scanner;

public class Proposto04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" Incial: ");
		int inicial = sc.nextInt();
		
		System.out.println(" Final: ");
		int fin = sc.nextInt();
		
		int x = fin - inicial;
		if (x > 0) {
			System.out.println(" O JOGO DUROU "+x+ " HORA (S)");
		}else {
			int y = 24 - inicial + fin; 
			System.out.println(" O JOGO DUROU " +y+ " HORA(S)");
		}
		
		
		sc.close();

	}

}
