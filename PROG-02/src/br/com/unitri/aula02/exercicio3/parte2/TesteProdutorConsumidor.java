package br.com.unitri.aula02.exercicio3.parte2;

public class TesteProdutorConsumidor {

	private static final int QUANTIDADE = 5;
	
	
	public static void main(String[] args) {
		
		
		Esteira esteira = new Esteira();
		
		
		
		Produtor pedro = new Produtor("Pedro", esteira, QUANTIDADE);
		Produtor joao = new Produtor("João", esteira, QUANTIDADE);
		Produtor maria = new Produtor("Maria", esteira, QUANTIDADE);
		
		Consumidor jose = new Consumidor("Jose", esteira, QUANTIDADE);
		Consumidor carlos = new Consumidor("Carlos", esteira, QUANTIDADE);
		
		
		new Thread(pedro, "Pedro").start();
		new Thread(joao, "Joao").start();
		new Thread(maria, "Maria").start();
		new Thread(jose, "Jose").start();
		new Thread(carlos, "Carlos").start();

	}
}
