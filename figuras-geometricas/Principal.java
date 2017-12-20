package com.curso.interfaces;
/**
 * Ejemplo de utilizaci�n de una interfaz
 * Conceptos: Encapsulamiento, Herencia y Polimorfismo
 * 
 * @author Ezequiel Llarena Borges
 * @version 20/03/2016
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		Principal p = new Principal();
		p.creaFiguras();
		p.mostrar1(); // Muestra la colecci�n de figuras usando referencia a una clase
		p.mostrar2(); // Muestras la colecci�n de figuras usando referencia a una interfaz

	}
	
	// Colecciones
	Figura[] coleccionFiguras;
	
	void creaFiguras() {
		Rectangulo r = new Rectangulo(10, 2);
		Cuadrado cu = new Cuadrado(8);
		Circulo ci = new Circulo(7);
		TrianguloRectangulo t = new TrianguloRectangulo(5, 3);
		coleccionFiguras = new Figura[] {r, cu, ci, t};
	}
	
	/*
	 * Se aplica POLIMORFISMO 
	 * Se llama al m�todo toString(), definido en la clase base Figura,
	 * pero en cada uno de los m�todos se llamar� a la definici�n de los m�todos 
	 * especializados de area() y de perimetro(), es decir, no se llamar�
	 * a los m�todos base de Figura, sino cada uno de los especializados
	 * (esto es lo que se conoce como polimorfismo)
	 * Tenemos muchas referencias (todas del mismo tipo Figura) aunque apunta a un objeto m�s
	 * especializado, cuando llamemos a un m�todo de esa referencias se
	 * utilizar� el m�todo m�s especialido area() y perimetro()
	 */
	void mostrar1() {
		System.out.println("Mostrar 1\n--------------------------");
		for(Figura f :coleccionFiguras) {
			System.out.println(f.toString());
		}
	}
	
	// Equivalente a utilizar una referencia de un tipo interfaz
	void mostrar2() {
		System.out.println("\nMostrar 2\n--------------------------");
		for(Figura f :coleccionFiguras) {
			mostrarDetalleFigura(f);
		}
	}

	void mostrarDetalleFigura(IFiguraGeometrica f) {
		System.out.println(f.toString());
	}
}

