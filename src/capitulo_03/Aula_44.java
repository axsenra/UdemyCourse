package capitulo_03;

import java.util.Locale;
import java.util.Scanner;

public class Aula_44 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the measures of triangule X: ");

		double ax = sc.nextDouble();
		double bx = sc.nextDouble();
		double cx = sc.nextDouble();

		System.out.println("Enter the measures of triangule Y: ");

		double ay = sc.nextDouble();
		double by = sc.nextDouble();
		double cy = sc.nextDouble();

		
		double px = (ax+bx+cx)/2;
		double py = (ay+by+cy)/2;
		
		double areax = Math.sqrt(px*(px-ax)*(px-bx)*(px-cx));
		double areay = Math.sqrt(py*(py-ay)*(py-by)*(py-cy));
		
		System.out.printf("Area do triangulo X: %.2f%n",areax);
		System.out.printf("Area do triangulo Y: %.2f%n",areay);
		
		if(areax > areay) {
			System.out.printf("Larger area: %.2f%n",areax);
		}else {
			System.out.printf("Larger area: %.2f%n",areay);
		}
		
		sc.close();

	}

}
