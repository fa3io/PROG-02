package br.com.unitri.aula01.parte01;

public class MinhaThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("===Inicio " + getName());
		for (int i = 0; i <= 500; i++) {
			
			System.out.println(i + " - " + getName());
		
		}
		System.out.println("=== Fim " + getName());
	}
}
