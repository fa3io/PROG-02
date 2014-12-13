package br.com.unitri.aula03.exercicio1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestaLeEscreve {

	public static void main(String[] args) {
		
		try {
			System.out.println(args[0]);
			System.out.println(args[1]);
			FileReader input = new FileReader(args[0]);
			FileWriter output = new FileWriter(args[1]);
			
			char[] buffer = new char[128]; //Quantidade de caracter lido por vez 
			int charLido;
			
		//Lê o primeiro buffer
			
			charLido = input.read(buffer);
			
			while (charLido != -1) {
				//Escreve o buffer no arquivo de saida
				output.write(buffer,0,charLido);
				
				//Lê o proximo buffer
				charLido = input.read(buffer);
			}
			System.out.println(output.toString());
			input.close();
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro : "+ e.getMessage());
		}
		
		
		
		
	}
}
