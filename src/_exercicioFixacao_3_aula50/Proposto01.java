package _exercicioFixacao_3_aula50;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Proposto01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and height:");
		retangulo.height = sc.nextDouble();
		retangulo.width = sc.nextDouble();
		
		System.out.println(retangulo); 
		
		sc.close();
	}

}
