package br.com.unitri.aula02.exercicio4;


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

	public void usar() throws InterruptedException{
		if(ocupado == false){
			
			ocupado = true;
			ocupante = Thread.currentThread().getName();
			duracao = (long)(Math.random() * 10000);
			
			System.out.println(ocupante + " entrou no banheiro...");
			System.out.println(ocupante + " usando durante " + duracao + " Milisegundos..." );
			
			Thread.sleep(duracao);
			System.out.println(ocupante + " Saiu do banheiro...");
			ocupado = false;
			
			synchronized (this) {
				notifyAll();
			}
			
			
		}else{
			
			String proximo = Thread.currentThread().getName();
			System.out.println(proximo + " tentou usar o banheiro, mas estah ocupado por " + ocupante);
			
			synchronized (this) {
				wait();
			}
			
			usar();
		}
	
	}
}
