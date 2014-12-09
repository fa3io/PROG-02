package br.com.unitri.aula02.exercicio3;

public class Esteira {
	
	private Item[] esteira = new Item[5];
	private boolean adicionou = false;
	
	
	public synchronized boolean add(Item item){
		for (int i = 0; i < esteira.length; i++) {
			if (esteira[i] == null) {
				esteira[i] = item;
				adicionou = true;
				return adicionou;
			}
		}
		return adicionou;
	}

}
