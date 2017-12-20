package com.curso.interfaces;
/**
 * Conceptos: Encapsulamiento, Herencia y Polimorfismo
 * 
 * @author Ezequiel Llarena Borges
 * @version 20/03/2016
 *
 */

// Herencia
public class Circulo extends Figura {

	public float radio;
	
	public Circulo(float radio) {
		this.radio = radio;
		this.nombreFigura = "Círculo";
	}
	
	// Sobreescritura
	@Override
	public float area() {
		return (float) (Math.PI * radio * radio);
	}
	
	@Override
	public float perimetro() {
		return (float) (2 * Math.PI * radio);
	}
	
}
