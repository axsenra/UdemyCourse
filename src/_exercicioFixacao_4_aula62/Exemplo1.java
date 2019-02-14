package _exercicioFixacao_4_aula62;

import java.util.Locale;
import java.util.Scanner;
import entities.Customer;

public class Exemplo1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String name;
		int accountNumber;
		double saldo;

		Customer cust1;

		System.out.println("###########Criando sua conta#############");

		System.out.print("Entre com seu nome: ");
		name = sc.next();

		System.out.print("Entre com numero da conta: ");
		accountNumber = sc.nextInt();

		System.out.print("Deseja informar o valor de deposito incial? (y/n)");
		char x = sc.next().charAt(0);

		if (x == 'y') {

			System.out.print("Entre com deposito Inicial: ");
			saldo = sc.nextDouble();

			cust1 = new Customer(accountNumber, name, saldo);

		} else {
			cust1 = new Customer(accountNumber, name);
		}

		System.out.print(cust1.toString());
		System.out.println();
		
		System.out.print("Deposito:");
		cust1.deposito(sc.nextDouble());
		
		System.out.print("Update Customer data:"+cust1.toString());
		System.out.println();
		
		
		System.out.print("Saque:");
		
		cust1.saque(sc.nextDouble());
		
		System.out.print("Update Customer data:"+cust1.toString());

		sc.close();

	}

}
