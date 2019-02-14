package curso;

public class RefString {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'x'); // troca tudo que é 'a' por 'x' ( caracter char)
		String s07 = original.replace("abc", "xy"); // troca substring " abc " por outra substring
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc"); 
		
		
		
		System.out.println("Original: -"+original+ "-");
		System.out.println("Lower Case : -"+s01+"-");
		System.out.println("Upper Case : -"+s02+"-");
		System.out.println("Trim : -"+s03+"-");
		System.out.println("Substring : -"+s04+"-");
		System.out.println("Substring Lim : -"+s05+"-");
		System.out.println("Replace : -"+s06+"-");
		System.out.println("Replace : -"+s07+"-");
		
		System.out.println("Index Of: " +i);
		System.out.println("Last Index Of:" +j);
	}

}
