/**
 * @author Ezequiel Llarena Borges
 * @version 1.0
 * @since jan 2018 
 * */
public class DivisionPorCero {

	public static void main(String[] args) {
		
		int numerador = 10;
		int denominador = 0;
		float division = 0;
		
		//System.out.println(numerador / denominador);
		
	// bloque try - catch - finally
		try {
			division = numerador / denominador;
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		} finally { // opcional, se ejecuta siempre
			System.out.println("División: " + division);
		}
		dividir();
		System.out.println("El programa continua ejecutándose...");
	;}
	
	 // throws
	static void dividir() throws ArithmeticException {
		int numerador = 100;
		int denominador = 0;
		try {
			System.out.println(numerador / denominador);
		} finally {
			System.out.println("División por cero!");
		}
	}
}

