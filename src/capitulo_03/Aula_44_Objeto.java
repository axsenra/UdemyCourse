package capitulo_03;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Aula_44_Objeto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Triangle x,y; 
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangule X: ");

		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangule Y: ");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double px = (x.a + x.b + x.c) / 2;
		double py = (y.a + y.b + y.c) / 2;

		double areax = Math.sqrt(px * (px - x.a) * (px - x.b) * (px - x.c));
		double areay = Math.sqrt(py * (py - y.a) * (py - y.b) * (py - y.c));

		System.out.printf("Area do triangulo X: %.2f%n", areax);
		System.out.printf("Area do triangulo Y: %.2f%n", areay);

		if (areax > areay) {
			System.out.printf("Larger area: %.2f%n", areax);
		} else {
			System.out.printf("Larger area: %.2f%n", areay);
		}

		sc.close();

	}

}
