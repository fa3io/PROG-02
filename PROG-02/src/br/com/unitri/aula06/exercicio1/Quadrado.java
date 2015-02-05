package br.com.unitri.aula06.exercicio1;

public class Quadrado implements Superficie {
	
	Double lado;
	
	public Quadrado(Double lado) {
		this.lado = lado;
	}

	@Override
	public Double area() {
		return lado *lado;
	}
	
	@Override
	public String toString() {
		return "Qudrado com Lado: " +  lado +" Area: " + area();
	}
}
