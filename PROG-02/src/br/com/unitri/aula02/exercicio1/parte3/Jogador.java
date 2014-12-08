package br.com.unitri.aula02.exercicio1.parte3;

public class Jogador extends Thread {

	private String name;
	private int chute;
	private Placar placar;

	public Jogador(String name, Placar placar) {
		this.name = name;
		this.placar = placar;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			chute++;
			placar.setPlacar();
			System.out.println(name + " deu o " + chute + "º chute.");
		}
		System.out.println("Jogador "+name+ " terminou os chutes. Total agora: "+placar.getPlacar());
	}

	public int quantidadeChutes() {
		return chute;
	}
}
