package br.com.unitri.aula02.exercicio4;

public class TesteFesta {
	public static void main(String[] args) {
		
		Pessoa roberto = new Pessoa("Roberto");
		Pessoa maria = new Pessoa("Maria");
		Pessoa ana = new Pessoa("Ana");
		Pessoa carlos = new Pessoa("Carlos");
		Pessoa jose = new Pessoa("Jose");
		
		
		new Thread(roberto, "Roberto").start();
		new Thread(maria, "Maria").start();
		new Thread(ana, "Ana").start();
		new Thread(carlos, "Carlos").start();
		new Thread(jose, "Jose").start();
		
		
	}
}
