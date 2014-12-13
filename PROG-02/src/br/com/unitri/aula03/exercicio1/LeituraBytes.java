package br.com.unitri.aula03.exercicio1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LeituraBytes {

	public static void main(String[] args) {
		// verifica a presenca de arqgumento com nome do arquivo
		if (args.length == 0) {
			System.out.println("Uso Correto: \njava EscritaBytes <nome do arquivo> [quantidade]");
			System.exit(-1);
		}

		// Efetua a abertura do aquivo para a leitura de bytes

		DataInputStream dis = null;

		try {
			dis = new DataInputStream(new FileInputStream(args[0]));
			System.out.println("Arquivo '" + args[0] + "' aberto.");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.exit(-1);
		}
		
		//Efetua a leitura do arquivo enquanto existirem dados.
		try {
			System.out.println("---- Inicio Conteudo ----");
			while(dis.available() >0) {
				int i = dis.readInt();
				double aux =dis.readDouble();
				System.out.println("#" + i + ":" + aux);
			}
			System.out.println("---- Fim Conteudo ----");
			dis.close();
			System.out.println("Arquivo '" + args[0] + "' Fechado. ");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
