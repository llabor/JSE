package com.curso.interfaces;

public class TrianguloIsosceles extends TrianguloRectangulo {
	
	public TrianguloIsosceles(float base, float altura) {
		super(base, altura);
		this.base = base;
		this.altura = altura;
		this.nombreFigura = "Triángulo Isósceles";
	}
	
	@Override
	public float perimetro() {
		// Se hace cast porque sqrt() devuelve un double
		return (float) (base + Math.sqrt(base*base+4*altura*altura));
	}
}

