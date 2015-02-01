package br.com.unitri.aula06.exercicio;

public class ArraySemGenerics {

	public static void main(String[] args) {
		
		Integer[] inteiros = {-3, -2, -1, 4, 0, 1, 2, 3 };
		Double[] doubles = {0.0, 0.5, 1.0, 1.5, -0.2};
		
		System.out.println("integer: " + ArrayToString(inteiros));
		System.out.println("Maior Integer" + maior(inteiros));

		System.out.println("double: " + ArrayToString(doubles));
		System.out.println("Maior Integer" + maior(doubles));
		
	}

	private static Double maior(Double[] doubles) {
		Double maior = doubles[0];
		for (double i : doubles) {
			if(maior.compareTo(i) > 0.0){
				maior = i;
		}
			
		}
	return maior;
	}

	private static Integer maior(Integer[] inteiros) {
		Integer maior = inteiros[0];
		for (int i : inteiros) {
			if(maior.compareTo(i) > 0){
				
				maior = i;
		}
			
		}
	return maior;
	}

	private static String ArrayToString(Double[] doubles) {
		StringBuffer sb = new StringBuffer("[ ");
		for (double d : doubles) {
			sb.append(d + ", ");
		}
		sb.append(" ]");
		return sb.toString();
	}

	private static String ArrayToString(Integer[] inteiros) {
		StringBuffer sb = new StringBuffer("[ ");
		for (int d : inteiros) {
			sb.append(d + ", ");
		}
		sb.append(" ]");
		return sb.toString();
	}
}
