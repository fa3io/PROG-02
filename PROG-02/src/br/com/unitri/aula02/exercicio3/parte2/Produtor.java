package br.com.unitri.aula02.exercicio3.parte2;

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
		return new Item(id, nome);
		
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= quantidade; i++) {
			try {
				ColocarNaEsteira(i,nome);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private void ColocarNaEsteira(int id, String nome) throws InterruptedException {
		Item item = criarItem(id, nome);
		esteira.add(item);
		
	}

}
