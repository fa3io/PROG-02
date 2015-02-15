package br.com.unitri.aula02.exercicio4;



public class Pessoa extends Thread {


	private int tempoFesta = 1000;
	Banheiro banheiro;

	public Pessoa(String nome, Banheiro banheiro) {
		super(nome);
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		irParaFesta();

		while (true) {
			try {
				banheiro.usar();
				irParaFesta();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	private void irParaFesta() {
		try {
			System.out.println(getName() + " Foi para a festa e volta em " + tempoFesta);
			Thread.sleep(tempoFesta);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
