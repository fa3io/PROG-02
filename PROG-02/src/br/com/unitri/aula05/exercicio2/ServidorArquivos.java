package br.com.unitri.aula05.exercicio2;

import java.io.File;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ServidorArquivos {

	Scanner scanner;

	public ServidorArquivos() {

		try {

			ServerSocket servidor = new ServerSocket(5000);

			while (true) {
				Socket cliente = servidor.accept();
				scanner = new Scanner(cliente.getInputStream());
				criarCaminho(scanner.nextLine());
			}

		} catch (Exception erro) {
			System.err.println("Erro: " + erro.getMessage());
		}
	}

	private void criarCaminho(String entrada) {
		try {
			File caminho = new File(entrada);
			if (caminho.exists()) {
				if (caminho.isDirectory()) {
					System.out.println(caminho + " - É Pasta e Já Existe");
					System.out.println("Deletando Arquivos dentro");
					listaArquivo(caminho);
					boolean deletado = deleteDir(caminho);
					boolean criado = caminho.mkdirs();
					System.out.println("foi deletado: " + deletado + " foi criado: "+ criado);
				}else{
					System.out.println(caminho + " == É Arquivo e Já Existe");
					System.out.println("Sobrescrevendo Arquivos ");
					caminho.delete();
					File novoarquivo = new File(caminho.getAbsolutePath().replace(".", "2."));
					novoarquivo.createNewFile();
				}
			}else{
				if (caminho.isDirectory()) {
					caminho.mkdir();
					System.out.println("Diretorio criado com sucesso !!");
				}
				if (caminho.isFile()) {
					caminho.createNewFile();
					System.out.println("Arquivo criado com sucesso !!");
				}
			}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	public void listaArquivo(File file) {
			String[] arquivos = file.list();
			System.out.println("=================================");
			for (String nome : arquivos) {
				System.out.println("Arquivo: "+ nome); 
			}
			System.out.println("=================================");
		}
	
	public static boolean deleteDir(File dir) {  
	       if (dir.isDirectory()) {  
	           String[] children = dir.list();  
	           for (int i=0; i<children.length; i++) {   
	              boolean success = deleteDir(new File(dir, children[i]));  
	               if (!success) {  
	                   return false;  
	               }  
	           }
	       }
	       return true;
	}
	         
	public static void main(String[] args) {

		new ServidorArquivos();

	}

}
