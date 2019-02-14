package capitulo_05;

public class Aula_72_Wrapper_BoxUnbox {

	public static void main(String[] args) {
		
		int x = 20;
		Object obj = x; 
		
		System.out.println(obj);
		
		int y = (int)obj; 
		
		System.out.println(y);
		
		
		System.out.println("-----------------------------");
		
		int x1 = 20;
		Integer obj1 = x1; 
		
		System.out.println(obj1);
		
		int y1 = obj1; 
		
		System.out.println(y1);
		
		
		
		
	}

}
