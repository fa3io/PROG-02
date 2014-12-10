package br.com.unitri.aula02.exercicio3;

public class Esteira {
	
	private Item[] esteira = new Item[5];
	private boolean adicionou = false;
	private boolean retirou = false;
	
	
	public synchronized boolean add(Item item){
		for (int i = 0; i < esteira.length; i++) {
			if (esteira[i] == null) {
				esteira[i] = item;
				System.out.println("Item "+ item +" Adicionado.");
				adicionou = true;
				return adicionou;
			}
		}
		if (!adicionou) {
			System.out.println("Esteira cheia item Descartado !!");
		}
		return adicionou;
	}
	
	public synchronized void remove(){
		for (int i = 0; i < esteira.length; i++) {
			if (!(esteira[i] == null)) {
				esteira[i] = null;
				retirou = true;
				return;
			}
		}
		if(!retirou){
			System.out.println("Droga esteira vazia !!!");
		}	
	}
	public void statusEsteira(){
		for (Item item : esteira) {
			System.out.println(item);
		}
		
	}

}
