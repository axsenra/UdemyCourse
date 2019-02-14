package _exercicioFixacao_5_aula76;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities_cap5.Funcionario;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Entre com o numero de funcionarios: ");
		int n = sc.nextInt(); 
		
		List<Funcionario> list = new ArrayList<>(n); 
		
		for(int i = 1; i<=n ; i++) {
			
			System.out.println();
			System.out.println("Funcionario #"+i);
			System.out.print("Id:");
			int id = sc.nextInt(); 
			
			System.out.print("Nome:");
			sc.nextLine();
			String nome = sc.nextLine(); 
			
			System.out.print("Salario:");
			double salario = sc.nextDouble();
			
			
			list.add(new Funcionario(id, nome, salario)); 
			
		}
		
		
		
		System.out.print("Entre com o funcionario que vai ganhar o aumento:");
		Integer funX = sc.nextInt(); 
		
		
		
		Funcionario fun = list.stream().filter(x -> x.getId() == funX).findFirst().orElse(null);

		if(fun == null) {
			System.out.println("Funcionario Inexistente!");
		}else {
			System.out.println("Entre com a % de aumento: ");
			double aumento = sc.nextDouble(); 
			
			fun.aumentaSalario(aumento);
		}

			
		for (Funcionario x : list) {
			System.out.println();
			System.out.println("Nome: "+x.getName());
			System.out.println("Id: "+x.getId());
			System.out.println("Salario: "+x.getSalario());
			System.out.println();
		}
		
		
		
		sc.close();

	}

}
