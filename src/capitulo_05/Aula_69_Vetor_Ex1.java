package capitulo_05;

import java.util.Locale;
import java.util.Scanner;

public class Aula_69_Vetor_Ex1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter qty of people:");
		int n = sc.nextInt(); 
		
		double[] vect = new double[n]; 
		double avg = 0;
		
		for(int i=0; i<n; i++) {
			System.out.print("Enter altura na posição #"+i);
			vect[i] = sc.nextDouble();
			
			avg += vect[i];
		
		}
		
		System.out.printf("Media: %.2f", avg/n);
	
		
		sc.close();
		
		
	}

}
