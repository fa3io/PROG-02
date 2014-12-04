package br.com.unitri.aula01.parte03;

public class MinhaThread implements Runnable {
	Double tempoTotal = 0.0;
	String threadName = Thread.currentThread().getName();
	
	@Override
	public void run() {
		System.out.println("Inicio " +threadName);
		for (int i = 0; i <= 4; i++) {
			System.out.println(i + " " + threadName);
			
			
			try {
				
				double dorme = Math.random() * 10000;
				System.out.println(threadName +" Vai dormir " + dorme +" Millisegundos");
				Thread.sleep((long) dorme);
				
				tempoTotal =+ dorme;
				
			} catch (InterruptedException e) {
				System.out.println("Ih... "+threadName+ " não pode parar agora");
			}
		
		}
		System.out.println("===== Fim " +threadName + " Dormiu " + tempoTotal +"=====");
	}
}
