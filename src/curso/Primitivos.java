package curso;

public class Primitivos {

	public static void main(String[] args) {
		
		boolean x = false;
		char y = 'F';
		byte z = 127;
		short a = -100;
		int b = 2000;
		long c = 2000000000L; 
		float m = 4.5f;
		double n = 4.5;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(m);
		System.out.println(n);
		
		String nome = "Maria Maria";
		Object obj1 = "MAria mAiririaia";
		Object obj2 = 4.5f;
		
		System.out.println(nome);
		System.out.println(obj1);
		System.out.println(obj2);

		// Casting
		double p;
		float t;
		
		p = 5.9;
		t = (float)p; // casting
		
		System.out.println(t);
		
		double h;
		int g;
		
		h = 5.9;
		g = (int)h; // casting
		
		System.out.println(g);
		
		//Conversão Implicita
		
		double result, result2;
		int aa, bb;
		
		aa = 5;
		bb = 2;
		
		result = aa/bb; // aa e bb foram truncados como inteiro.. 
		result2 = (double)aa / bb; //conversao implicita
		
		System.out.println(result);
		System.out.println(result2);
		

	}

}
