package br.com.unitri.aula02.exercicio3;

public class Produtor implements Runnable {
	
	String nome;
	Esteira esteira;
	int quantidade;
	
	public Produtor(String nome, Esteira esteira, int quantidade) {
		this.nome = nome;
		this.esteira = esteira;
		this.quantidade = quantidade;
	}
	
	public Item criarItem(int id, String nome){
		System.out.println("Item Criado! ");
		return new Item(id, nome);
		
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= quantidade; i++) {
			ColocarNaEsteira(i,nome);
		}
	}

	private void ColocarNaEsteira(int id, String nome) {
		Item item = criarItem(id, nome);
		System.out.println("Item " + item + " criado...");
		esteira.add(item);
		
	}

}
