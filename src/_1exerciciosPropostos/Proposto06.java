package _1exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Proposto06 {

	public static void main(String[] args) {
		
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double A,B,C; 
	
	A = sc.nextDouble(); // base Triang
	B = sc.nextDouble();
	C = sc.nextDouble(); // altura triang
	
	double areaTriangulo = (A*C)/2; 
	double areaCirculo = 3.14159*C*C;
	double areaTrapezio = ((A+B)*C)/2;
	double areaQuadrado = B*B;
	double areaRetangulo = A*B; 
	
	
	System.out.printf("Triangulo: %.3f%n",areaTriangulo);
	System.out.printf("Circulo: %.3f%n",areaCirculo);
	System.out.printf("Trapezio: %.3f%n",areaTrapezio);
	System.out.printf("Quadrado: %.3f%n",areaQuadrado);
	System.out.printf("Retangulo: %.3f%n",areaRetangulo);
	
	sc.close();

	}

}
