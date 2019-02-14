package curso;

public class Variaveis {

	public static void main(String[] args) {
		//OPERADORES ARITIMETICOS
		
		int n1 = 3 + 4*2;
		System.out.println(n1);
		
		int n2 = (3+4)*2;
		System.out.println(n2);
		
		int n3 = 17 % 3;
		System.out.println(n3);
		
		double n4 = 10/8; //vai truncar o resultado
		double n5 = (double)10/8; // usando casting
		double n6 = 10.0/8; // indicando que o numero 10 é double
		
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		
		System.out.println("---------------------------");
		
		//formula de bascara
		
		double a =1, b = -3, c = -4;
		
		double x1 = (-b + Math.sqrt(b*b - 4.0*a*c))/(2.0*a);
		System.out.println(x1);
		
		System.out.println("---------------------------");
		
		a += a;
		System.out.println(a);
		
		System.out.println("---------------------------");
		
		int xa = 10;
		int xb = xa++;
		System.out.println(xa);
		System.out.println(xb);
		System.out.println(xb);
		
		int xc = 10;
		int xd = ++xc;
		System.out.println(xc);
		System.out.println(xd);
		
		
		

	}

}
