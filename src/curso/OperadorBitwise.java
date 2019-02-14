package curso;

import java.util.Scanner;

public class OperadorBitwise {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int mask = sc.nextInt();
		int n = 32;
		
		if((n & mask) != 0) {
			System.out.println(" 6th digit is true");
		
		}else {
			System.out.println("it is false");
		}
	
		
		
		
		sc.close();

	}

}
