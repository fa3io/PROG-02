package br.com.unitri.aula01.parte03;

public class TestaMinhaThread {

	public static void main(String[] args) {
	System.out.println("Começo do programa principal...");
	MinhaThread thread1 = new MinhaThread();
	MinhaThread thread2 = new MinhaThread();
	MinhaThread thread3 = new MinhaThread();
	
	Thread t1 = new Thread(thread1);
	Thread t2 = new Thread(thread2);
	Thread t3 = new Thread(thread3);
	
	t1.setName("Thead - 1");
	t2.setName("Thead - 2");
	t3.setName("Thead - 3");
	

	System.out.println("Fim do programa principal...");
	}
}
