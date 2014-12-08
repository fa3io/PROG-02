package br.com.unitri.aula02.exercicio2;

public class Conta {
	
	private int saldo;
	
	public  void depositar(int valor) {
		this.saldo += valor;
	}
	public int sacar() {
		return saldo;
	}

}
