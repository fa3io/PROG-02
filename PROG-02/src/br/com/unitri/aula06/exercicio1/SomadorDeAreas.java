package br.com.unitri.aula06.exercicio1;


public class SomadorDeAreas {

	public SomadorDeAreas( ) {
		
	}
	
	public <T extends Superficie> void somaArea(T array[]){
		
		Double soma = 0.0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
			soma += array[i].area();
		}
		
		System.out.println("Area total de elemento do array: " + soma);
	}
	
	
}
