package com.curso.interfaces;

public class TestFigura {

	public static void main(String[] args) {
		
		TrianguloIsosceles ti = new TrianguloIsosceles(5, 4);
		System.out.println(ti.toString());
	
//		System.out.println(ti.nombreFigura + ":");
//		System.out.println("Área: " + ti.area());
		//System.out.println("Perímetro: " + ti.perimetro());
		
		TrianguloEquilatero te = new TrianguloEquilatero(6);
		System.out.println(te.toString());
		
		//System.out.println(te.nombreFigura + ":");
		//System.out.println("Área: " + te.area());
		//System.out.println("Perímetro: " + te.perimetro());
	}

}
