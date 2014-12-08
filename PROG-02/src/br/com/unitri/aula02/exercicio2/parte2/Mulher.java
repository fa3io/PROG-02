package br.com.unitri.aula02.exercicio2.parte2;

public class Mulher extends Thread {

	private int quantidade;
	private Conta conta;
	private int total;

	public Mulher(int quantidade, Conta conta) {
		this.quantidade = quantidade;
		this.conta = conta;
	}

	@Override
	public void run() {

		System.out.println("Mulher Sacando");

		for (int i = 0; i < quantidade; i++) {
			int valor = conta.sacar();
			
			System.out.println("Sacado: " + valor);
			total += valor;
		}
		System.out.println("Total Sacado pelo Mulher: " + total);
		System.out.println("Saldo Final: " + conta.getSaldo());
	}
}
