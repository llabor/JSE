package com.curso.interfaces;
/**
 * Ejemplo de utilización de una interfaz
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
		p.mostrar1(); // Muestra la colección de figuras usando referencia a una clase
		p.mostrar2(); // Muestras la colección de figuras usando referencia a una interfaz

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
	 * Se llama al método toString(), definido en la clase base Figura,
	 * pero en cada uno de los métodos se llamará a la definición de los métodos 
	 * especializados de area() y de perimetro(), es decir, no se llamará
	 * a los métodos base de Figura, sino cada uno de los especializados
	 * (esto es lo que se conoce como polimorfismo)
	 * Tenemos muchas referencias (todas del mismo tipo Figura) aunque apunta a un objeto más
	 * especializado, cuando llamemos a un método de esa referencias se
	 * utilizará el método más especialido area() y perimetro()
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

