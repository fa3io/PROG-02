package br.com.unitri.aula06.exercicio1;

public class Triangulo implements Superficie {
	
	Double base;
	Double altura;
	
	public Triangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public Double area() {
		return base * (altura/2);
	}
	
	@Override
	public String toString() {
		return "Triangulo com Base: " +  base + " Altura: " + altura + " Area: " + area();
	}

}
