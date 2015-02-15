package br.com.unitri.aula03.exercicio1;

import java.io.File;

public class ListaArquivosDiretorio {
	
 
	static final String caminho = "C:\\Users\\Fábio\\Downloads\\Apostilas Caelum";

	public static void main(String[] args) {
		
		
		
		File file = new File(caminho);
		
		if (file.exists()) {
			listar(file);
		}else{
			System.out.println("Caminho informado não existe !!!!");
		}
		
		

	}

	private static void listar(File file) {
		
		
		String tab = "";
		if(file.isDirectory()){
			
			
			
			
			
			System.out.println(tab + "Diretorio: " + file);

			for (String s : file.list()) {
				
				String subCaminho = file.getPath() + File.separator + s;
				File subDiretorio = new File(subCaminho);
				listar(subDiretorio);
				
			}
		}
		if(file.isFile()){
			System.out.println(file);
		}
		
	}

}
