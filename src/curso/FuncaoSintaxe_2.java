package curso;

import java.util.Scanner;

public class FuncaoSintaxe_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Entre com 3 numeros: ");

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		int higher = max(n1, n2, n3);

		showresult(higher); 
	
		
		sc.close();

	}

// CRIAÇÂO DA FUNCÂO PARA CALCULO DO MAIRO NUMERO

	public static int max(int a, int b, int c) {
		int aux;

		if (a > b && a > c) {
			aux = a;
		} else if (b > c) {
			aux = b;
		} else {
			aux = c;
		}

		return aux;
	}
	
	public static void showresult(int valor) {
		System.out.println("Maior numero é: "+valor);
	}

}
