package br.com.unitri.aula01.parte04.exercicio;

/* Aplicação que simula uma corrida de sapos usando threads */
public class CorridaDeSapos {
	final static int NUM_SAPOS = 5;	// QTE. de sapos na corrida
	final static int DISTANCIA = 500; // Distância da corrida em cm
	public static void main (String[] args) {
		// colocando sapos na corrida
		
		
		// Estanciando e colocando nome e distancia em construtor
		SapoCorrendoThread fred = new SapoCorrendoThread("Fred", DISTANCIA);
		SapoCorrendoThread ded = new SapoCorrendoThread("Ded", DISTANCIA);
		SapoCorrendoThread mok = new SapoCorrendoThread("mok", DISTANCIA);
		
		//Definindos as prioridades de cada Thread
		mok.setPriority(Thread.MAX_PRIORITY);
		ded.setPriority(Thread.NORM_PRIORITY);
		fred.setPriority(Thread.MIN_PRIORITY);
		
		
		/* Iniciando as threads
		...
		*/
		fred.start();
		ded.start();
		mok.start();


		
	}
}
