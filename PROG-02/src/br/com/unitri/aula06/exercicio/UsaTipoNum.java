package br.com.unitri.aula06.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsaTipoNum {

	private static Scanner teclado;

	public static void main(String[] args) {

		teclado = new Scanner(System.in);

		List<TipoNum<String>> lista = new ArrayList<TipoNum<String>>();

		while (true) {

			System.out.println("Digite se nome: (Digite . para finalizar)");
			String nome = teclado.next();
			
			if(nome.equals("."))break;
			System.out.println("Digite um número:");
			int numero = teclado.nextInt();

			lista.add(new TipoNum<String>(numero, nome));
		}
		//Com JAVA 7
		for (TipoNum<String> tipoNum : lista) {
			System.out.println(tipoNum.toString());
		}
		System.out.println("\n\n");
		
		//Com JAVA 8
		lista.forEach(System.out::println);
	}
}
