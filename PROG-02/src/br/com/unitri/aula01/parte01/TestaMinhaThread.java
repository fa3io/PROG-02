package br.com.unitri.aula01.parte01;

public class TestaMinhaThread {

	public static void main(String[] args) {
	System.out.println("Come�o do programa principal...");
	MinhaThread thread1 = new MinhaThread();
	MinhaThread thread2 = new MinhaThread();
	MinhaThread thread3 = new MinhaThread();
	
	thread1.setName("Thead - 1");
	thread1.setName("Thead - 2");
	thread1.setName("Thead - 3");
	
	thread1.setPriority(Thread.MIN_PRIORITY);
	thread1.setPriority(Thread.NORM_PRIORITY);
	thread1.setPriority(Thread.MAX_PRIORITY);
	
	
	thread1.start();
	thread2.start();
	thread3.start();
	
	System.out.println("Fim do programa principal...");
	}
}
