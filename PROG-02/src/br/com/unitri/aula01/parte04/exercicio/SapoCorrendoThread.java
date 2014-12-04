package br.com.unitri.aula01.parte04.exercicio;

/** Classe usando Thread que simula a corrida de um sapo */
class SapoCorrendoThread extends Thread {

	int distanciaCorrida = 0;		// distância já corrida pelo sapo
	int distanciaTotalCorrida;		// distância a ser corrida pelo sapo
	int pulo = 0;					// pulo do sapo em cm
	int pulos = 0;					// quantidades de pulos dados na corrida
	static int colocacao = 0;		// colocação do sapo ao final da corrida
	final static int PULO_MAXIMO = 50; // pulo máximo em cm que um sapo pode dar

	/** Construtor da classe. Parâmtros : Nome do Sapo e Distância da Corrida */
	public SapoCorrendoThread (String nome, int distanciaTotalCorrida) {
		// o nome da thread é o nome do sapo
		setName(nome);
		this.distanciaTotalCorrida = distanciaTotalCorrida;
	}
	/** Imprime o último pulo do sapo e a distância percorrida */
	public void sapoImprimindoSituacao () {
		// A frase deve ser: " O #nome_do_sapo# pulou XX cm e ja percorreu YY cm"
		
		System.out.println("O Sapo "+ getName() + " pulou "+ pulo +"cm  e já percorreu "+ distanciaCorrida +"cm" );
	}
	/** Faz o sapo pular */
	public void sapoPulando() {
		pulos++;
		pulo = (int) (Math.random() * PULO_MAXIMO);
		distanciaCorrida += pulo;
		if (distanciaCorrida > distanciaTotalCorrida) {
			distanciaCorrida = distanciaTotalCorrida;
		}
	}
	/** Representando o descanso do sapo */
	public void sapoDescansando () {
		// Método que passa vez a outras threads 
		yield();
	}
	/** Imprime a colocação do sapo ao final da corrida */
	public void colocacaoSapo () {
		colocacao++;
		// A frase deve ser: #nome_do_sapo# foi o Y colocado com X pulos"
		System.out.println(getName()+" foi o "+ colocacao + " colocado com "+ pulos +" pulos");

	}
	/** Método run da thread Corrida de Sapos 
	...
		/* Enquanto a distancia percorrida for menor que a distancia total faz:
			- o sapo pular
			- imprime a última situação do sapo
			- faz o sapo descansar
		Mostra colocação do sapo

	*/
	@Override
	public void run() {
		while(distanciaCorrida < distanciaTotalCorrida){
			sapoPulando();
			sapoImprimindoSituacao();
			sapoDescansando();
		}
		colocacaoSapo();
	}
}
