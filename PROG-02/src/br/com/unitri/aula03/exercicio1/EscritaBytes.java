package br.com.unitri.aula03.exercicio1;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class EscritaBytes {

	public static void main(String[] args) {

		// verifica a presenca de arqgumento com nome do arquivo
		if (args.length == 0) {
			System.out
					.println("Uso Correto: \njava EscritaBytes <nome do arquivo> [quantidade]");
			System.exit(-1);
		}

		// Efetua a abertura do aquivo para a leitura de bytes

		DataOutputStream dos = null;

		try {
			dos = new DataOutputStream(new FileOutputStream(args[0]));
			System.out.println("Arquivo '" + args[0] + "' aberto.");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.exit(-1);
		}
		// Converte a quantidade dada pelo usuario ou usa padrao

		int quantidade = 10;

		try {
			quantidade = Integer.parseInt(args[1]);
		} catch (Exception e) {
			System.out.println("Usando quantidade padrão: 10");
		}
		// Gera quantidade indicada de valores aleatorios

		try {
			System.out.println("---- Gerando Conteudo ----");
			for (int i = 0; i < quantidade; i++) {
				dos.writeInt(quantidade);
				double aux = Math.random();
				dos.writeDouble(aux);
				System.out.println("#" + i + ":" + aux);
			}
			System.out.println("---- Fim Conteudo ----");
			dos.close();
			System.out.println("Arquivo '" + args[0] + "' Fechado. ");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
