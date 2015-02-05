package br.com.unitri.aula06.exercicio1;

public class Circulo implements Superficie{
	
	Double raio;
	Double PI = 3.14;
	
	public Circulo(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double area() {
		return PI * (raio * raio);
	}
	
	@Override
	public String toString() {
		return "Circulo com Raio: " +raio + " Area: " + area();
	}
	
}
