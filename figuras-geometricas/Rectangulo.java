package com.curso.interfaces;
/**
 * Conceptos: Encapsulamiento, Herencia y Polimorfismo
 * 
 * @author Ezequiel Llarena Borges
 * @version 20/03/2016
 *
 */

// Herencia
public class Rectangulo extends Figura {

	public float lado1,lado2;
	
	public Rectangulo(float lado1, float lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.nombreFigura = "Rectángulo";
	}
	
	@Override
	public float area() {
		return this.lado1 * this.lado2;
	}
	
	@Override
	public float perimetro() {
		return (2 * (this.lado1 + this.lado2));
	}
	
	
}
