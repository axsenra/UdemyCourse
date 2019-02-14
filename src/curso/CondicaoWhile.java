package curso;

import java.util.Scanner;

public class CondicaoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		
		System.out.print("Enter a number");
		
		while (num >= 0) {
			double res;
			res = Math.sqrt(num);
			System.out.printf("%n%.3f%n",res);
			System.out.print("Enter another number:");
			num = sc.nextDouble();
		}
		System.out.println("Negative number");
		
		sc.close();

	}

}
