package curso;

import java.util.Scanner;

public class FuncaoSintaxe {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in); 
	
	System.out.println(" Entre com 3 numeros: ");
	
	int n1  =sc.nextInt();
	int n2 = sc.nextInt();
	int n3 = sc.nextInt();
	
	if(n1 > n2 && n1>n3) { 
		System.out.println(" Maior numero: "+n1);
	}else if(n2 > n3) {
		System.out.println("Mairo numero: "+n2);
	}else {
		System.out.println("Mairo numero: "+n3);
		
	}
		
	
	sc.close();

	}

}
