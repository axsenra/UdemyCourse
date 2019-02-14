package curso;

import java.util.Scanner;

public class CondicaoTernaria {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------Condição Tradicional de IF-ELSE");
		
		
	
		double preco = 34.5;
		double desconto; 
		
		if (preco < 20.0) {
			desconto  = preco * 0.1; 
		}else {
			desconto = preco * 0.05; 
		}
		System.out.println(desconto);
		
		
		System.out.println("--------Condição Ternaria");
		
		double preco2 = 34.5; 
		double desconto2 = (preco2 <20.0) ? preco2 * 0.1 : preco2*0.05; 
		
		

	System.out.println(desconto2);
		
		
		
		
		
		
		sc.close();
	}

}
