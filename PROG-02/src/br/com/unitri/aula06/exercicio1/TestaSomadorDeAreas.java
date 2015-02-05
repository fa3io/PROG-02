package br.com.unitri.aula06.exercicio1;

public class TestaSomadorDeAreas {

	public static void main(String[] args) {
	
		
		Triangulo triangulo1 = new Triangulo(10.0, 15.00);
		Triangulo triangulo2 = new Triangulo(25.0, 30.00);
		
		Quadrado quadrado1 = new Quadrado(23.00);
		Quadrado quadrado2 = new Quadrado(18.00);
		
		Circulo circulo1 = new Circulo(30.00);
		Circulo circulo2 = new Circulo(50.00);
		
		SomadorDeAreas somador = new SomadorDeAreas();
		
		Superficie[] geometricos = {triangulo1, triangulo2, quadrado1, quadrado2, circulo1, circulo2};

		somador.somaArea(geometricos);
	}

}
