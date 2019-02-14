package curso;

import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
				
		System.out.print("How many integer number are you going to enter: ");
		int n = sc.nextInt();
		
		int soma = 0; 
		int valor;
		
		for(int i=1 ; i<=n; i++) {
			
			System.out.print("Value #"+i+": ");
			valor = sc.nextInt();
			
			
			soma = soma + valor; 
			
		}
		
		System.out.println("Sum: "+soma);
		
		sc.close();
		
		
	}

}
