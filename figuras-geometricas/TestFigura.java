package com.curso.interfaces;

public class TestFigura {

	public static void main(String[] args) {
		
		TrianguloIsosceles ti = new TrianguloIsosceles(5, 4);
		System.out.println(ti.toString());
	
//		System.out.println(ti.nombreFigura + ":");
//		System.out.println("�rea: " + ti.area());
		//System.out.println("Per�metro: " + ti.perimetro());
		
		TrianguloEquilatero te = new TrianguloEquilatero(6);
		System.out.println(te.toString());
		
		//System.out.println(te.nombreFigura + ":");
		//System.out.println("�rea: " + te.area());
		//System.out.println("Per�metro: " + te.perimetro());
	}

}
