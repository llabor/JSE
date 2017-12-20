
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
			System.out.println("Divisi�n: " + division);
		}
		dividir();
		System.out.println("El programa continua ejecut�ndose...");
	;}
	
	 // throws
	static void dividir() throws ArithmeticException {
		int numerador = 100;
		int denominador = 0;
		try {
			System.out.println(numerador / denominador);
		} finally {
			System.out.println("Divisi�n por cero!");
		}
	}
}

