package br.com.unitri.aula02.exercicio3.parte1;

public class Consumidor implements Runnable {

	String nome;
	Esteira esteira;
	int quantidade;

	public Consumidor(String nome, Esteira esteira, int quantidade) {
		this.nome = nome;
		this.esteira = esteira;
		this.quantidade = quantidade;
	}

	@Override
	public void run() {

		for (int i = 0; i < quantidade; i++) {
			System.out.println("Removendo Item...");
			esteira.remove();
		}

	}

}
