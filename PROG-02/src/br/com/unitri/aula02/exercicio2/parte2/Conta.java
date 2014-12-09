package br.com.unitri.aula02.exercicio2.parte2;

public class Conta {

	private int saldo;
	private Boolean ok = false;

	public synchronized void depositar(int valor) {

		while (ok == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}

		this.saldo += valor;
		ok = true;
		System.out.println("Depositado: "+ valor);
		notifyAll();

	}

	public synchronized int sacar() {

		while (ok == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		int saldoAnterior = saldo;
		saldo = 0;
		ok = false;
		System.out.println("Sacado: " + saldoAnterior);
		notifyAll();
		return saldoAnterior;

	}
	public int getSaldo() {
		return saldo;
	}

}
