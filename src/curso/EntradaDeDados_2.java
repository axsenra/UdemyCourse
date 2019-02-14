package curso;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados_2 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US); 
	
	Scanner sc = new Scanner(System.in);
	
	int n1 = sc.nextInt();
	sc.nextLine(); //chamado FLUSH resolve o problema de o nextLine ter sido ocupado pelo primeiro enter
	
	String name = sc.nextLine(); // nextLine() pega o "enter" da primeira linha
	
	char gender = sc.next().charAt(0);
	
	// Manipulando o STRING b5
	
	String s = sc.next(); 
	
	char letter = s.charAt(0);
	int digit = Integer.parseInt(s.substring(1));
	
	// 4.32 --- numero double
	
	double nx = sc.nextDouble();
	
	// Maria F 23 1.68
	
	String nome2 = sc.next();
	char gender2 = sc.next().charAt(0);
	int age = sc.nextInt();
	double h = sc.nextDouble();
	
	
	
	System.out.println(n1);
	System.out.println(name);
	System.out.println(gender);
	System.out.println(letter);
	System.out.println(digit);
	System.out.println(nx);
	
	System.out.println(nome2);
	System.out.println(gender2);
	System.out.println(age);
	System.out.println(h);

	sc.close();

	}

}
