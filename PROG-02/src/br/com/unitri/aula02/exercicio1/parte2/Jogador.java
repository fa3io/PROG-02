package br.com.unitri.aula02.exercicio1.parte2;

public class Jogador extends Thread {

	private String name;
	private int chute;

	public Jogador(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			chute++;
			System.out.println(name + " deu o " + chute + "º chute.");
		}
	}

	public int quantidadeChutes() {
		return chute;
	}
}
