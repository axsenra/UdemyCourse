package _exercicioFixacao_5_aula71;

import java.util.Locale;
import java.util.Scanner;

import entities_cap5.Pensao;

public class Pensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter qty of students renting: ");
		int n = sc.nextInt();

		Pensao[] vect = new Pensao[10];

		for (int i = 0; i < n; i++) {

			sc.nextLine();
			String name = sc.nextLine();
			String email = sc.nextLine();
			int nquarto = sc.nextInt();

			vect[nquarto] = new Pensao(name, email, nquarto);
		}

		System.out.println("Busy rooms: ");
		for (int i = 0; i < vect.length; i++) {

			if (vect[i] != null) {
			System.out.println(vect[i].toString());
		}}

		sc.close();

	}
}