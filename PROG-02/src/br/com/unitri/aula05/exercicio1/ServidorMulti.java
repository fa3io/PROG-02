package br.com.unitri.aula05.exercicio1;

import java.net.ServerSocket;
import java.net.Socket;

public class ServidorMulti {
	
	public static void main(String[] args) {
		
		int idCliente = 0;
		
		try{
			System.out.println("[Criando Servidor...]");
			ServerSocket servidor = new ServerSocket(1234);
			System.out.println("Servidor Operando na porta: 1234");
	
			while(true){
				
				System.out.println("Aguardando Conexoes.....");
				
				Socket cliente = servidor.accept();
				new Contador(idCliente++, cliente).start();;
		
			}
	
		}catch(Exception erro){
			System.out.println("Erro em servidor: "+erro);
		}
	}

}
