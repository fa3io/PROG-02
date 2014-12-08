package br.com.unitri.aula02.exercicio2.parte2;

public class TesteConta {
	
	

	public static void main(String[] args) {
		Conta contaCorrente = new Conta();
		int quantidade = 5;
		
		
		Homem homem = new Homem(quantidade, contaCorrente);
		Mulher mulher = new Mulher(quantidade,contaCorrente);
		
		homem.start();
		mulher.start();

	}

}
