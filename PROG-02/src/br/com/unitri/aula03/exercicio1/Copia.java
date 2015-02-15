package br.com.unitri.aula03.exercicio1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copia {

	public static void main(String[] args) {
		
		System.out.println("0 = " + args[0]);
		System.out.println("1 = " + args[1]);
		
		copiaArquivo(args[0], args[1]);

	}

	private static void copiaArquivo(String origem, String destino) {

		try {
			//Cria nossas Stream com a origem e o destino.
			BufferedInputStream org = new BufferedInputStream(new FileInputStream(origem));
			BufferedOutputStream dest = new BufferedOutputStream(new FileOutputStream(destino));
			
			int disp; // numero de bytes disponiveis
			
			System.out.println("Numero de bytes a serem copiados: "+org.available());
			
			while((disp = org.available()) > 0){ // se dados disponiveis
			byte[] dados = new byte[disp];		//	le todos os dados
			org.read(dados,0,disp);				// 	grava todos os dados
			dest.write(dados, 0, disp);
			}
			
			System.out.println("Copia realizada com Sucesso!!!");
			
			org.close();
			dest.flush();
			dest.close();
			
			
		} catch (IOException e) {
		System.out.println("Copia n�o foi possivel " + e);	
		}
		
	}

}
