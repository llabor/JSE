package com.curso.interfaces;
/**
 * Conceptos: Encapsulamiento, Herencia y Polimorfismo
 * 
 * @author Ezequiel Llarena Borges
 * @version 20/03/2016
 *
 */
public class Cuadrado extends Rectangulo {
	// Caso especial de un rectángulo donde 
	// todos sus lados son iguales. Por ello
	// hereda de la clase base Rectangulo y no Figura
	
	public float lado;
	// Solo necesitamos la longitud de un lado para
	// describir un cuadrado
	
	public Cuadrado(float lado) {
		super(lado, lado);
		this.lado = lado;
		this.nombreFigura = "Cuadrado";
	}
}
