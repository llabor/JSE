package com.curso.interfaces;

public class TrianguloEquilatero extends TrianguloIsosceles {

	public TrianguloEquilatero(float lado) {
		super(lado, lado);
		this.base = lado;
		this.nombreFigura = "Triángulo Equilátero";
	}
	
	@Override
	public float area() {
		// Se hace cast porque sqrt() devuelve un double
		return (float) ((base * Math.sqrt(3*base*base/4))/2);
	}
	
	@Override
	public float perimetro() {
		return (3*base);
	}

}
