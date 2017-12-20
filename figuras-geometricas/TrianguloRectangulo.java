package com.curso.interfaces;
/**
 * Conceptos: Encapsulamiento, Herencia y Polimorfismo
 * 
 * @author Ezequiel Llarena Borges
 * @version 20/03/2016
 *
 */
public class TrianguloRectangulo extends Figura {
	
	//			|\		area = base * altura / 2
	//			| \		
	//	altura	|  \  hipotenusa
	//  		|   \
	//			|____\  	hipotenusa = sqrt(area*area + base*base)
	//			 base		perimetro = altura + base + hipotenusa
	
	public TrianguloRectangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
		this.nombreFigura = "Triángulo Rectángulo";
	}
	
	public float base;
	public float altura;
	
	@Override
	public float area() {
		return (base * altura / 2);
	}
	
	public float perimetro() {
		// Se hace cast porque sqrt() devuelve un double
		return (float) (base + altura + Math.sqrt(base*base+altura*altura));
	}
}
