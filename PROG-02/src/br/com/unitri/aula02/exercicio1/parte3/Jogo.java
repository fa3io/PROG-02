package br.com.unitri.aula02.exercicio1.parte3;

public class Jogo {

	
	public static void main(String[] args) {
		Placar p = new Placar();
		
		Jogador fabio = new Jogador("Fabio", p);
		Jogador luiz = new Jogador("Luiz", p);
		Jogador flavio = new Jogador("Flavio", p);
		
		fabio.start();
		luiz.start();
		flavio.start();
		
	}
}
