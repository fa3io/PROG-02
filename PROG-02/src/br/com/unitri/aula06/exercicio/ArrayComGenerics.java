package br.com.unitri.aula06.exercicio;

public class ArrayComGenerics {

	public static void main(String[] args) {

		Integer[] inteiros = { -3, -2, -1, 4, 0, 1, 2, 3 };
		Double[] doubles = { 0.0, 0.5, 1.0, 1.5, -0.2 };

		System.out.println("integer: " + ArrayToString(inteiros));
		System.out.println("Maior Integer" + maior(inteiros));

		System.out.println("double: " + ArrayToString(doubles));
		System.out.println("Maior Integer" + maior(doubles));

	}

	private static <T extends Comparable<T>> T maior(T array[]) {
		T maior = array[0];
		for (T i : array) {
			if (maior.compareTo(i) > 0.0) {
				maior = i;
			}

		}
		return maior;
	}

	private static String ArrayToString(Object array[]) {
		StringBuffer sb = new StringBuffer("[ ");
		for (Object d : array) {
			sb.append(d + ", ");
		}
		sb.append(" ]");
		return sb.toString();
	}


}
