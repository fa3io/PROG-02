package br.com.unitri.aula02.exercicio4;

public class Pessoa implements Runnable{
	
	private String nome;
	private int tempoFesta = 1000;
	
	public Pessoa(String nome){
		this.nome = nome;
	}

	@Override
	public void run() {
		irParaFesta();
		System.out.println("Chegou a Festa!");
		
	}

	private void irParaFesta() {
		try {
			System.out.println(nome + "Foi para a festa e volta em "+ tempoFesta);
			Thread.sleep(tempoFesta);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
