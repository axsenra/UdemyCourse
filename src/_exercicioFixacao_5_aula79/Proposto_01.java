package _exercicioFixacao_5_aula79;

import java.util.Scanner;

public class Proposto_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int linha = sc.nextInt();
		int col = sc.nextInt();

		int[][] mat = new int[linha][col];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				mat[i][j] = sc.nextInt();

			}
		}

		System.out.println("Enter numb X:");
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				if(mat[i][j] == x) {

					System.out.println("Position:" +i+", "+j);	
						
					if (j-1 >= 0) {
					System.out.println("Left: "+mat[i][j-1]);
					}
					if( j +1 < col) {
					System.out.println("Right: "+mat[i][j+1]);
					}
					if (i+1 <= linha) {
					System.out.println("Down: "+mat[i+1][j]);
					}
					if(i-1 >= 0) {
					System.out.println("Up: "+mat[i-1][j]);}
				}
				
				
			}
		}

		sc.close();

	}

}
