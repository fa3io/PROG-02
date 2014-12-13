package br.com.unitri.aula03.exercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TesteLeEscreveComBuffer {
	
	public static void main(String[] args) {
		
		try {
			
			FileReader input = new FileReader(args[0]);
			BufferedReader bufInput = new BufferedReader(input);
			
			FileWriter out = new FileWriter(args[1]);
			BufferedWriter bufoutput = new BufferedWriter(out);
			
			String linha;
			
			//Lê primeira linha 
			linha = bufInput.readLine();
			
			while (linha != null) {
				//Escre linha no arquivo de saida
				bufoutput.write(linha, 0, linha.length());
				
				bufoutput.newLine(); // testar
				
				//Lê a proxima linha
				linha = bufInput.readLine();
			}
			bufInput.close();
			bufoutput.close();
			
		} catch (Exception e) {
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
