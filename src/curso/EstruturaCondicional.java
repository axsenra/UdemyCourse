package curso;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter with intenger number:");
		int n = sc.nextInt();
		
		if (n%2 == 0) { 
			System.out.println(" Yes, it is Even!");
		}else { 
			System.out.println(" No, it is Odd!");
		}
		
		
		
		System.out.println("-----------------------------------");
		
		System.out.println("What time is it?");
		
		int h = sc.nextInt();
		
		if(h < 12) {
			System.out.println("Good morning!");
		}else if (n < 18){
			System.out.println("Good afternoon!");
		}else {
			System.out.println("Good night!");
		}
		
		
		
		sc.close();
	}

}
