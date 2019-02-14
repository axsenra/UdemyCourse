package _4exercicioProposto;

import java.util.Scanner;

public class Proposto04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			if (b == 0) {
				System.out.println("Divisão impossivel");}
			else {
				System.out.println((double) a / b);
			}

		}

		sc.close();

	}

}
