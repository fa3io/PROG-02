package br.com.unitri.aula03.exercicio1;

import java.io.File;



public class Verificador {
	
	

	public static void main(String[] args) {
		
		//Carrega file (Arquivo ou caminho)
		File file = new File(args[0]);
		
		//Verifica se é valido
		if(file.exists()){
			
			//Verifica se é Arquivo
			if(file.isFile()){
				listaArquivo(file);
			}
			//Verifica se é diretorio
			if (file.isDirectory()) {
				listarDiretorio(file);
			}
			
			
			
		}else{
			System.out.println("Arquivo informado não existe !!!");
			System.out.println(file);
		}
		
		

	}

	private static void listarDiretorio(File file) {
		File[] files = file.listFiles();
		long totalBytes =0;
		Formatador f = new Formatador();
		System.out.println("Diretorio: " + file);
		for (int i = 0; i < files.length; i++) {
			if(files[i].isFile()){
				listaArquivo(files[i]);
				totalBytes += files[i].length();
			}	
		}
		System.out.println("Total bytes no diretorio: "+ f.formataBytes(totalBytes));
		System.out.println("Bytes utilizados em disco: "+ f.formataBytes(((file.getTotalSpace()) - (file.getUsableSpace()))));
		System.out.println("Bytes Disponiveis em disco: "+ f.formataBytes(file.getFreeSpace()));
		System.out.println("Bytes Totais em disco: "+ f.formataBytes(file.getTotalSpace()));
		
		
	}

	private static void listaArquivo(File file) {
		Formatador f = new Formatador();
		System.out.println("=================================");
		System.out.println("Arquivo: "+ file);
		System.out.println("Nome do arquivo: "+ file.getName());
		System.out.println("Ultima data de modificação: "+ f.formataData(file.lastModified()));
		System.out.println("Tamanho em bytes: "+ f.formataBytes(file.length()));
		System.out.println("Leitura: " + (file.canRead()? "Sim":"Não"));
		System.out.println("Gravação: " + (file.canWrite()? "Sim":"Não"));
		System.out.println("Oculto: " + (file.isHidden()? "Sim":"Não")); 
		System.out.println("=================================");
	}

}
