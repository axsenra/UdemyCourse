package capitulo_05;

import java.util.Locale;
import java.util.Scanner;

import entities_cap5.Produto;

public class Aula_70_Vetor_Ex2_Classe {

	public static void main(String[] args) {
		
Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		Produto[] vect = new Produto[n]; 
		
		
		for(int i = 0; i<vect.length ;i++) {
			
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Produto(name, price); 
		}
		
		double sum = 0.0; 
		
		for(int i=0;i<vect.length;i++) {
			
			sum += vect[i].getPrice();
			
		}
		
		double avg = sum/ vect.length;
		
		System.out.printf(" Media de preco %.2f", avg);
		
		sc.close();

	}

}
