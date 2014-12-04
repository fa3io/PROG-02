package br.com.unitri.aula01.parte02;

public class MinhaThread extends Thread {
	Double tempoTotal = 0.0;
	
	@Override
	public void run() {
		System.out.println("Inicio " + getName());
		for (int i = 0; i <= 4; i++) {
			System.out.println(i + " " + getName());
			
			
			try {
				
				double dorme = Math.random() * 10000;
				System.out.println(getName() +" Vai dormir " + dorme +" Millisegundos");
				sleep((long) dorme);
				
				tempoTotal =+ dorme;
				
			} catch (InterruptedException e) {
				System.out.println("Ih... "+getName()+ " não pode parar agora");
			}
		
		}
		System.out.println("===== Fim " + getName() + " Dormiu " + tempoTotal +"=====");
	}
}
