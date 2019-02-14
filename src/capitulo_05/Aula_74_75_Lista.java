package capitulo_05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula_74_75_Lista {

	public static void main(String[] args) {
		
		List<String> list ;  // não aceita tipo primitivo... wrapper class; 
		list = new ArrayList<>(); //instanciando a Interface List...... dentro do <> não precisa mais dizer que tipo é
		
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		list.add(2,"Marco"); // adicionando elementos na lista
		
		
		System.out.println(list.size()); // puxando o tamanho da lista; 
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		
		System.out.println("--------------------------------");
		// remoções
		
		//list.remove("Anna");
		//list.remove(1);
		
		//usando PREDICADO
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		

		System.out.println("--------------------------------");
		
		System.out.println("Index Of:"+list.indexOf("Bob"));
		System.out.println("Index Of:"+list.indexOf("Marco")); // não existe (retorna -1)
		
		
		System.out.println("--------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		
		System.out.println("--------------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		
	}

}
