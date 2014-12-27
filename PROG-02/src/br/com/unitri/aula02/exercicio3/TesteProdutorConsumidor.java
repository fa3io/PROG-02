package br.com.unitri.aula02.exercicio3;

public class TesteProdutorConsumidor {

	private static final int QUANTIDADE = 20;
	
	
	public static void main(String[] args) {
		
		
		Esteira esteira = new Esteira();
		
		
		
		Produtor pedro = new Produtor("Pedro", esteira, QUANTIDADE);
		Produtor joao = new Produtor("João", esteira, QUANTIDADE);
		Produtor maria = new Produtor("Maria", esteira, QUANTIDADE);
		
		Consumidor jose = new Consumidor("Jose", esteira, QUANTIDADE);
		Consumidor carlos = new Consumidor("Carlos", esteira, QUANTIDADE);
		
		
		new Thread(pedro).start();
		new Thread(joao).start();
		new Thread(maria).start();
		new Thread(jose).start();
		new Thread(carlos).start();

	}
}
