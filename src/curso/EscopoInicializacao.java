package curso;

public class EscopoInicializacao {

	public static void main(String[] args) {

		// ERRO INICIALIZAÇÂO DE VARIAVEL

		// double x; // erro do compilador porque a variavel tem que ser inicializada
		// System.out.println(x); // erro do compilador porque a variavel tem que ser
		// inicializada

		// ERRO DE ESCOPO

		double price = 400.00;
		if (price < 200) {

			double discount = price * 0.01;

		}

		// System.out.println("Desconto: "+discount); // Erro porque a variavel
		// "discount" foi inicializada dentro do IF

		double price2 = 400.00;
		double discount;
		if (price2 < 200) {

			discount = price2 * 0.01;

		}

		// System.out.println("Desconto: "+discount); // erro continua porque como
		// "discount" esta dentro do IF pode ser que a condicional pule o calculo;

		// ALTERNATIVO para inicializar a variavel usando o ELSE

		double price3 = 400.00;
		double discount2;
		if (price3 < 200) {

			discount2 = price2 * 0.01;

		} else {
			discount2 = 0;
		}

		System.out.println("Desconto: " + discount2);

	}

}
