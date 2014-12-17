package br.com.unitri.aula04.exercicio1;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorBasico {
	
	public static void main(String[] args) {
		
		try{
			
			System.out.println("[Criando Servidor...]");
			
			ServerSocket servidor = new ServerSocket(123);
			
			System.out.println("Servidor Operando na porta: 123");
			
			
			while(true){
				
				System.out.println("Aguardando Conexões.....");
				
				Socket cliente = servidor.accept();
				
				System.out.println("[Conexão aberta de "+ cliente.getInetAddress().toString()+ "]");
				System.out.println("[Enviando dados ....]");
				
				ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
				
				saida.flush(); // Envia Cabeçalho de preparo  do outro endpoint 
				//saida.writeObject("SOH"); //Star of Header
				
				saida.writeObject("Servidor basico conectado");
				saida.writeObject("Procesando Dados....");
				saida.writeObject("Dados de conexão "+ cliente.toString());
				saida.writeObject("Tchau!!!");
				System.out.println("[Dados Enviados!]");
				saida.writeObject("EOT"); // End Of Transfer
				cliente.close();
				System.out.println("[Conexão Encerrada!]");		
			}
	
		}catch(Exception erro){
			System.out.println("Erro em servidor: "+erro);
		}
	}

}
