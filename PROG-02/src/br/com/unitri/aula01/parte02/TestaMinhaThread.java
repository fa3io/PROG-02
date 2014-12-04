package br.com.unitri.aula01.parte02;

public class TestaMinhaThread {

	public static void main(String[] args) {
	System.out.println("Começo do programa principal...");
	MinhaThread thread1 = new MinhaThread();
	MinhaThread thread2 = new MinhaThread();
	MinhaThread thread3 = new MinhaThread();
	
	thread1.setName("Thead - 1");
	thread1.setName("Thead - 2");
	thread1.setName("Thead - 3");
	
	
	thread1.start();
	thread2.start();
	thread3.start();
	
	System.out.println("Fim do programa principal...");
	}
}
