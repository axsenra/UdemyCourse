package _exercicioFixacao_3_aula50;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Proposto02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee(); 
		
		System.out.println("Nome: ");
		employee.name = sc.nextLine();
		
		System.out.println("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
	
		System.out.println("Employee: "+employee);
		
		
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble(); 
		employee.increaseSalary(percentage);
		
		System.out.println("Update data:"+employee);
		
		sc.close();

	}

}
