package _3exercicioProposto;

import java.util.Scanner;

public class Proposto03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 1;
		int gasolina = 2; 
		int diesel = 3; 
		int fim = 4; 
		
		int cAlcool = 0, cGasolina = 0, cDiesel = 0; 

		System.out.print("Entre o tipo de combustivel: ");
		int x = sc.nextInt();
		
		while( x != 4) {
			
			if(x == 1) {
				cAlcool = ++cAlcool; 
			}else if (x == 2) {
				cGasolina = ++cGasolina; 
			}else if (x ==3 ){
				cDiesel = ++cDiesel; 
			}
			
			System.out.println("novo cliente: ");
			x = sc.nextInt(); 
			
			
		}
		System.out.println("Muito Obrigado");
		System.out.println("Alcool:"+cAlcool);
		System.out.println("Gasolina:"+cGasolina);
		System.out.println("Diesel:"+cDiesel);
		

		sc.close();
		

	}

}
