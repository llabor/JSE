package com.curso.interfaces;
/**
 * Ejemplo de utilización de una interfaz
 * Conceptos: Encapsulamiento, Herencia y Polimorfismo
 * 
 * @author Ezequiel Llarena Borges
 * @version 20/03/2016
 *
 */
public class Figura implements IFiguraGeometrica {  //Clase Base

	public String nombreFigura;
	
	public float area() {
		return 0;
	}
	
	public float perimetro() {
		return 0;
	}
	
	// Podemos usarlo sin conocer el detalle del tipo de figura
	public String toString() {
		return nombreFigura + " Area: " + area()
				+ " Perímetro: " + perimetro();
	}
	
}
