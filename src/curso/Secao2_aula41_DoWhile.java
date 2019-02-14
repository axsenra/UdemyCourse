package curso;

import java.util.Scanner;

public class Secao2_aula41_DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		char x; 
		
		do {
			System.out.print("Enter a number: ");
			int n = sc.nextInt();
			double result = Math.sqrt(n);
			System.out.println("Raiz Quadr: "+result);
			
			System.out.println("Repeat: ");
			x = sc.next().charAt(0);
			
		}while(x == 'y'); 



		sc.close();
		
		
		
	}

}
