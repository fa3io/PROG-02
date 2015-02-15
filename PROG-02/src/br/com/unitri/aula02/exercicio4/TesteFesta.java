package br.com.unitri.aula02.exercicio4;

public class TesteFesta {
	public static void main(String[] args) {
		
		Banheiro banheiro = new Banheiro();
		
		Pessoa roberto = new Pessoa("Roberto", banheiro);
		Pessoa maria = new Pessoa("Maria", banheiro);
		Pessoa ana = new Pessoa("Ana", banheiro);
		Pessoa carlos = new Pessoa("Carlos", banheiro);
		Pessoa jose = new Pessoa("Jose", banheiro);
		
		
		roberto.start();
		maria.start();
		ana.start();
		carlos.start();
		jose.start();
		
		
	}
}
