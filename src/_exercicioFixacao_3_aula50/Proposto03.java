package _exercicioFixacao_3_aula50;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Proposto03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Nome:");
		student.name = sc.nextLine();
		
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		
		System.out.println("FINAL GRADE = " +student.notaFinal());
		if(student.notaFinal()>60.0)

		{
			
			System.out.println("PASS");
		}else
		{
			System.out.println("FAILED");
			System.out.println("Missing " +student.reprovado() + " POINTS");
		}
		
		
		
		sc.close();
		
	}

}
