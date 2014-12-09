package br.com.unitri.aula02.exercicio2.parte2;



public class Homem extends Thread {

	private int quantidade;
	private Conta conta;
	private int total;
	
	public Homem(int quantidade, Conta conta) {
		this.quantidade = quantidade;
		this.conta = conta;
	}
	
	@Override
	public void run() {
		System.out.println("Homem Depositando");
		
		for (int i = 0; i < quantidade; i++) {
			int valor = (int) (Math.random()* 12345);
			conta.depositar(valor);
			total += valor;	
		}
		System.out.println("Total Depositado pelo Homem: "+ total);	
	}
}
