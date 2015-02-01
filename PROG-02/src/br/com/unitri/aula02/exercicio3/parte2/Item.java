package br.com.unitri.aula02.exercicio3.parte2;

public class Item {
	int id;
	String produtor;
	
	public Item(int id, String produtor) {
		this.id = id;
		this.produtor = produtor;
	}
	
	@Override
	public String toString() {
		return id +" - "+ produtor;
	}

}
