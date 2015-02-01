package br.com.unitri.aula02.exercicio4;

import java.util.Random;

public class Banheiro {
	
	private String ocupante = "";
	private boolean ocupado = false;
	private long duracao = 0;
	
	/**
	 * - avisa quem está usando o banheiro
- controla se está ocupado ou desocupado
=> define quem entra
=> define quem sai
	 * @throws InterruptedException 
	 */

	public void usarBanheiro() throws InterruptedException{
		if(!ocupado){
			
			
			ocupante = Thread.currentThread().getName();
			duracao = (long)(Math.random() * 10);
			
		
			System.out.println(ocupante + "usando banheiro...");
			System.out.println(ocupante + "usando durante " + duracao + "Milisegundos..." );
			Thread.sleep(duracao);
			desocuparBanheiro();
			
		}
		
		
	}

	private void desocuparBanheiro() {
		// TODO Auto-generated method stub
		
	}
	
	
}
