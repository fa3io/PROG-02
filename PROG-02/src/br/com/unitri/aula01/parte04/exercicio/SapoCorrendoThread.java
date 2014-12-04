package br.com.unitri.aula01.parte04.exercicio;

/** Classe usando Thread que simula a corrida de um sapo */
class SapoCorrendoThread extends Thread {

	int distanciaCorrida = 0;		// dist�ncia j� corrida pelo sapo
	int distanciaTotalCorrida;		// dist�ncia a ser corrida pelo sapo
	int pulo = 0;					// pulo do sapo em cm
	int pulos = 0;					// quantidades de pulos dados na corrida
	static int colocacao = 0;		// coloca��o do sapo ao final da corrida
	final static int PULO_MAXIMO = 50; // pulo m�ximo em cm que um sapo pode dar

	/** Construtor da classe. Par�mtros : Nome do Sapo e Dist�ncia da Corrida */
	public SapoCorrendoThread (String nome, int distanciaTotalCorrida) {
		// o nome da thread � o nome do sapo
		setName(nome);
		this.distanciaTotalCorrida = distanciaTotalCorrida;
	}
	/** Imprime o �ltimo pulo do sapo e a dist�ncia percorrida */
	public void sapoImprimindoSituacao () {
		// A frase deve ser: " O #nome_do_sapo# pulou XX cm e ja percorreu YY cm"
		
		System.out.println("O Sapo "+ getName() + " pulou "+ pulo +"cm  e j� percorreu "+ distanciaCorrida +"cm" );
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
		// M�todo que passa vez a outras threads 
		yield();
	}
	/** Imprime a coloca��o do sapo ao final da corrida */
	public void colocacaoSapo () {
		colocacao++;
		// A frase deve ser: #nome_do_sapo# foi o Y colocado com X pulos"
		System.out.println(getName()+" foi o "+ colocacao + " colocado com "+ pulos +" pulos");

	}
	/** M�todo run da thread Corrida de Sapos 
	...
		/* Enquanto a distancia percorrida for menor que a distancia total faz:
			- o sapo pular
			- imprime a �ltima situa��o do sapo
			- faz o sapo descansar
		Mostra coloca��o do sapo

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
